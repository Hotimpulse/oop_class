<template>
  <div class="wrapper">
    <BannerComponent :name="'Our Project'" />
    <div class="project_selector-wrapper">
      <button @click="filterTags('Bathroom')" class="project_selector-item">
        Bathroom
      </button>
      <button @click="filterTags('Bedroom')" class="project_selector-item">
        Bedroom
      </button>
      <button @click="filterTags('Kitchen')" class="project_selector-item">
        Kitchen
      </button>
      <button @click="filterTags('Living Area')" class="project_selector-item">
        Living Area
      </button>
    </div>

    <div class="wrapper-grid">
      <div class="project_selector_card-wrapper">
        <router-link to="/project-details">
          <div
            v-for="(project, index) in filteredProjects"
            :key="index"
            :class="['project_selector_card', `${project.type}`]"
          >
            <img :src="project.src" :alt="project.text" />
            <div class="project_selector_card_text-img-wrapper">
              <div class="project_selector_card_text-wrapper">
                <p :class="['project_selector_card_text']">
                  {{ project.text }}
                </p>
                <p :class="['project_selector_card_text2']">
                  {{ project.subtext }}
                </p>
              </div>
              <button class="blog-latest-post_wrapper-line-btn">
                <img
                  class="follow-projects_grid-card_btn-arrow"
                  src="./../assets/imgs/arrow_circle.svg"
                  alt="pointer arrow icon"
                />
              </button>
            </div>
          </div>
        </router-link>
      </div>
    </div>
    <PaginationComponent :items="['01', '02', '03']" />
  </div>
</template>

<script>
import BannerComponent from "@/components/BannerComponent.vue";
import PaginationComponent from "@/components/PaginationComponent.vue";

export default {
  name: "ProjectPage",
  components: {
    BannerComponent,
    PaginationComponent,
  },
  data() {
    return {
      allProjects: [
        {
          category: "Living Area",
          type: "box-big",
          src: require("./../assets/imgs/bedroom1.jpg"),
          text: "Living Area",
          subtext: "Decor / Architecture",
        },
        {
          category: "Bedroom",
          type: "box-small",
          src: require("./../assets/imgs/bedroom2.jpg"),
          text: "Minimal Bedroom",
          subtext: "Decor / Bedroom",
        },
        {
          category: "Bedroom",
          type: "box-small",
          src: require("./../assets/imgs/bedroom3.jpg"),
          text: "Classic Minimal Bedroom",
          subtext: "Decor / Bedroom",
        },
        {
          category: "Bathroom",
          type: "box-small",
          src: require("./../assets/imgs/bedroom4.jpg"),
          text: "Modern Bathroom",
          subtext: "Decor / Bathroom",
        },
        {
          category: "Kitchen",
          type: "box-small",
          src: require("./../assets/imgs/bedroom5.jpg"),
          text: "Dining table",
          subtext: "Decor / Kitchen",
        },
        {
          category: "Bedroom",
          type: "box-small",
          src: require("./../assets/imgs/bedroom6.jpg"),
          text: "Minimal Bedroom table",
          subtext: "Decor / Bedroom",
        },
        {
          category: "Bedroom",
          type: "box-small",
          src: require("./../assets/imgs/bedroom7.jpg"),
          text: "Modern Bedroom",
          subtext: "Decor / Bedroom",
        },
        {
          category: "Bedroom",
          type: "box-small",
          src: require("./../assets/imgs/bedroom8.jpg"),
          text: "Modern Bedroom",
          subtext: "Decor / Bedroom",
        },
      ],
      displayedProjects: [],
      selectedCategory: null,
    };
  },
  methods: {
    filterTags(category) {
      this.selectedCategory = category;
      console.log(category);
    },
  },
  computed: {
    filteredProjects() {
      return this.selectedCategory
        ? this.allProjects.filter(
            (project) => project.category === this.selectedCategory
          )
        : this.allProjects;
    },
  },
};
</script>

<style lang="scss">
@mixin centerFlex {
  display: flex;
  justify-content: center;
  align-items: center;
  margin: 0 auto;
}

.wrapper-grid {
  @include centerFlex;
}

.project_selector-wrapper {
  @include centerFlex;
  border: 1px solid wheat;
  width: 880px;
  border-radius: 20px;
  margin-bottom: 61px;
}

.project_selector-item {
  @include centerFlex;
  width: 219px;
  height: 75px;

  color: #292f36;
  text-align: center;
  font-family: Jost;
  font-size: 18px;
  font-weight: 600;
  line-height: 125%;
  letter-spacing: 0.36px;

  border-radius: 18px;
  border: none;
  background: white;
  cursor: pointer;
  transition: all 0.3s ease-in-out;
  &:hover {
    background: #cda274;
  }
}

.project_selector_card-wrapper {
  width: 100%;
  max-width: 1200px;
  column-count: 2;
  gap: 2rem;
  margin-bottom: 61px;
  &_-link {
    text-decoration: none;
  }
}

.box-big {
  height: 947px;
}

.box-small {
  height: 616px;
}

.project_selector_card {
  display: flex;
  flex-direction: column;
  margin-bottom: 1rem;
  break-inside: avoid;
  height: fit-content;
  &_text-img-wrapper {
    display: flex;
    justify-content: space-between;
    align-items: center;
    height: 70px;
  }
  &_text-wrapper {
    display: flex;
    flex-direction: column;
  }

  &_text {
    color: #292f36;
    font-family: "DM Serif Display";
    font-size: 25px;
    font-weight: 400;
    line-height: 125%;
    letter-spacing: 0.5px;
    margin-bottom: 4px;
    font-style: none;
  }
  &_text2 {
    color: #4d5053;
    font-family: Jost;
    font-size: 22px;
    font-weight: 400;
    line-height: 150%;
    letter-spacing: 0.22px;
    margin: 0;
    text-decoration: none;

  }
}

.blog-latest-post_wrapper-line-btn {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 52px;
  height: 52px;
  border-radius: 10rem;
  border: none;
  background: #f4f0ec;
  cursor: pointer;
}

.blog-latest-post_wrapper-line-btn:hover {
  background-color: rgba(77, 80, 83, 0.7137254902);
}

.follow-projects_grid-card_btn {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 70px;
  height: 70px;
  border-radius: 10rem;
  border: none;
  background: #f4f0ec;
  cursor: pointer;
}
.follow-projects_grid-card_btn:hover {
  background-color: rgba(77, 80, 83, 0.7137254902);
}
.follow-projects_grid-card_btn-arrow {
  width: 8px;
  height: 18px;
}
</style>
