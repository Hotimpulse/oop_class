<template>
  <HeaderComponent />
  <div :class="$style.wrapper">
    <BannerComp :name="Articles & News" />
    <main>

      <section :class="$style['blog-latest-post']">
        <h1 :class="$style['blog-latest-post_headline']">Latest Post</h1>
        <div :class="$style['blog-latest-post_wrapper']">
          <img
            :class="$style['blog-latest-post_wrapper-img']"
            src="./../assets/imgs/latest-post.png"
            alt="latest post kitchen"
          />
          <div :class="$style['blog-latest-post_wrapper-text-wrapper']">
            <p :class="$style['blog-latest-post_wrapper-header']">
              Low Cost Latest Invented Interior Designing Ideas
            </p>
            <p :class="$style['blog-latest-post_wrapper-text']">
              Lorem ipsum dolor sit amet, adipiscing Aliquam eu sem vitae turpis
              dignissim maximus.posuere in.Contrary to popular belief.
            </p>
            <p :class="$style['blog-latest-post_wrapper-text_2']">
              Lorem Ipsum is not simply random text. It has roots in a piece of
              classica.
            </p>

            <div :class="$style['blog-latest-post_wrapper-line']">
              <span :class="$style['blog-latest-post_wrapper-line-text']"
                >26 December, 2022</span
              >
              <button :class="$style['blog-latest-post_wrapper-line-btn']">
                <img
                  :class="$style['follow-projects_grid-card_btn-arrow']"
                  src="./../assets/imgs/arrow_circle.svg"
                  alt="pointer arrow icon"
                />
              </button>
            </div>
          </div>
        </div>
      </section>

      <section :class="$style['articles-news']">
        <h2 :class="$style['articles-news_header']">Articles & News</h2>

        <div :class="$style['blog-articles-news-container']">
          <div
            v-for="(card, index) in cards"
            :key="index"
            :class="$style[card.class]"
          >
            <template v-for="(value, key) in card.children">
              <template v-if="key !== 'children'">
                <component
                  v-if="value.type !== 'htmlContent'"
                  :is="value.type"
                  :class="$style[card.class]"
                  :src="value.src.startsWith('/') ? value.src : `/assets${value.src}`"
                  :alt="value.alt"
                  :key="key"
                ></component>
                <span
                  v-else-if="value.type === 'htmlContent'"
                  :class="$style[value.class]"
                  v-html="value.text"
                  :key="`level1_${index}_${value.text}`"
                ></span>
              </template>
              <div
                v-else-if="key === 'children'"
                :class="$style[value.class]"
                :key="`levelas1_${index}_${value.text}`"
              >
                <template v-for="(child, childIndex) in value">
                  <template v-if="child.type !== 'children'">
                    <component
                      v-if="child.type !== 'htmlContent'"
                      :is="child.type"
                      :class="$style[child.class]"
                      :src="child.src.startsWith('/') ? child.src : `/assets${child.src}`"
                      :alt="child.alt"
                      :key="childIndex"
                    ></component>
                    <span
                      v-else-if="child.type === 'htmlContent'"
                      :class="$style[child.class]"
                      v-html="child.text"
                      :key="`level2_${index}_${childIndex}`"
                    ></span>
                  </template>
                  <div
                    v-else-if="
                      child.type === 'div' &&
                      child.class === 'articles-news-card_wrapper'
                    "
                    :key="childIndex"
                  >
                    <div :class="$style[child.class]">
                      <template
                        v-for="(grandchild, grandIndex) in child.children"
                      >
                        <template v-if="grandchild.type !== 'children'">
                          <component
                            v-if="grandchild.type !== 'htmlContent'"
                            :is="grandchild.type"
                            :class="$style[grandchild.class]"
                            :src="grandchild.src.startsWith('/') ? grandchild.src : `/assets${grandchild.src}`"
                            :alt="grandchild.alt"
                            :key="grandIndex"
                          ></component>
                          <span
                            v-else-if="grandchild.type === 'htmlContent'"
                            :class="$style[grandchild.class]"
                            v-html="grandchild.text"
                            :key="`level3_${index}_${childIndex}_${grandIndex}`"
                          ></span>
                        </template>
                      </template>
                    </div>
                  </div>
                </template>
              </div>
            </template>
          </div>
        </div>
      </section>

      <PaginationComponent :items="['01', '02', '03']" />
    </main>
  </div>
  <FooterComponent />
</template>

<script>
import FooterComponent from "../components/FooterComponent.vue";
import HeaderComponent from "../components/HeaderComponent.vue";
import BannerComp from "@/components/BannerComp.vue";
import PaginationComp from "@/components/PaginationComp.vue";

export default {
  name: "BlogPage",
  components: {
    FooterComponent,
    HeaderComponent,
    BannerComp,
    PaginationComp
  },
  el: ".blog-articles-news-container",
  data: function () {
    return {
      cards: [],
    };
  },
  mounted() {
    this.fetchData();
  },
  methods: {
    fetchData() {
      fetch("./data.json")
        .then((response) => response.json())
        .then((data) => {
          this.cards = data.cards;
        })
        .catch((error) => {
          console.error(`Error fetching data:`, error);
        });
    },
  },
};
</script>

<style lang="scss" module>
@mixin centerFlex {
  display: flex;
  justify-content: center;
  align-items: center;
  margin: 0 auto;
}

.wrapper {
  @include centerFlex;
  flex-direction: column;
  width: fit-content;
  padding: 0 5rem;
}

.blog-latest-post {
  display: flex;
  flex-direction: column;
  gap: 2rem;
  margin-bottom: 150px;
  &_headline {
    color: #292f36;
    font-family: "DM Serif Display";
    font-weight: 400;
    font-size: 3.125rem;
    line-height: 125%;
    letter-spacing: 0.0625rem;
  }
  &_wrapper {
    display: flex;
    gap: 4rem;
    max-width: 1200px;
    height: 522px;
  }
  &_wrapper-text-wrapper {
    display: flex;
    flex-direction: column;
    max-width: 463px;
    margin-top: 4rem;
  }
  &_wrapper-header {
    color: #292f36;
    font-family: "DM Serif Display";
    font-size: 1.5625rem;
    line-height: 125%;
    letter-spacing: 0.03125rem;
    margin-bottom: 1.4rem;
  }
  &_wrapper-text {
    color: #4d5053;
    font-family: "Jost";
    font-size: 1.375rem;
    font-weight: 400;
    line-height: 150%;
    letter-spacing: 0.01375rem;
    margin-bottom: 2rem;
    &_2 {
      color: #4d5053;
      font-family: "Jost";
      font-size: 1.375rem;
      font-weight: 400;
      line-height: 150%;
      letter-spacing: 0.01375rem;
      margin-bottom: 2rem;
    }
  }
  &_wrapper-line {
    display: flex;
    justify-content: space-between;
    align-items: center;
    max-width: 489px;
  }
  &_wrapper-line-text {
    color: #4d5053;
    font-family: Jost;
    font-size: 1rem;
    font-weight: 400;
    line-height: 150%;
    letter-spacing: 0.01rem;
    text-transform: capitalize;
  }

  &_wrapper-line-btn {
    justify-content: center;
    align-items: center;
    width: 52px;
    height: 52px;
    border-radius: 10rem;
    border: none;
    background: #f4f0ec;
    cursor: pointer;
    &:hover {
      background-color: #4d5053b6;
    }
  }
}

.blog-articles-news-container {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 1rem;
  margin-bottom: 41px;
}
</style>
