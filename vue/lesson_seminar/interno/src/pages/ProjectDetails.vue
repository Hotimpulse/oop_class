<template>
  <div class="project-dets_wrapper">
    <BannerComponent name="Details" />
    <div class="project-dets_content">
      <div class="article" v-for="(project, index) in allProjects" :key="index">
        <h1 class="project-dets_headline">{{ project.text }}</h1>
        <p class="project-dets_text">{{ fetchArticles[project.category] }}</p>
      </div>
      <b-container>
        <b-carousel
          id="carousel-fade"
          fade
          controls
          @sliding-start="onSlideStart"
          @sliding-end="onSlideEnd"
        >
          <b-carousel-slide
            :img-src="require('@/assets/imgs/proj_details_1.png')"
          >
          </b-carousel-slide>
          <b-carousel-slide
            :img-src="require('@/assets/imgs/kitchen_dets1.png')"
          >
          </b-carousel-slide>
          <b-carousel-slide
            :img-src="require('@/assets/imgs/kitchen_dets2.png')"
          ></b-carousel-slide>
        </b-carousel>
      </b-container>
    </div>
  </div>
</template>

<script>
import BannerComponent from "@/components/BannerComponent.vue";
import { mapGetters } from "vuex";

export default {
  name: "ProjectDetails",
  components: {
    BannerComponent,
  },
  computed: {
    ...mapGetters(["fetchArticles", "allProjects"]),
  },
  mounted() {
    this.$store.commit("setSelectedCategory", "Living Area");
  },
  data() {
    return {
      slide: 0,
      sliding: null,
    };
  },
  methods: {
    onSlideStart() {
      this.sliding = true;
    },
    onSlideEnd() {
      this.sliding = false;
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

.project-dets {
  &_content {
    @include centerFlex();
    flex-direction: column;
    margin-bottom: 100px;
  }
  &_headline {
    color: #292f36;
    font-family: "DM Serif Display";
    font-size: 50px;
    line-height: 125%;
    letter-spacing: 1px;
    margin-bottom: 11px;
    text-align: center;
  }
  &_text {
    color: #4d5053;
    font-family: Jost;
    font-size: 22px;
    line-height: 150%;
    letter-spacing: 0.22px;
    margin-bottom: 100px;
    text-align: center;
  }
  &_img {
    max-width: 100%;
  }
}
</style>
