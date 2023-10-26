<template>
  <div class="wrapper">
    <HeaderComponent />
    <main>
      <section class="blog-hero">
        <img src="./../assets/imgs/blog-banner.jpg" alt="blog banner image" />
        <div class="blog-hero_text-wrapper">
          <h1 class="blog-hero_header">Articles & News</h1>
          <span class="blog-hero_span">Home / Blog</span>
        </div>
      </section>

      <section class="blog-latest-post">
        <h1 class="blog-latest-post_headline">Latest Post</h1>
        <div class="blog-latest-post_wrapper">
          <img
            class="blog-latest-post_wrapper-img"
            src="./../assets/imgs/latest-post.png"
            alt="latest post kitchen"
          />
          <div class="blog-latest-post_wrapper-text-wrapper">
            <p class="blog-latest-post_wrapper-header">
              Low Cost Latest Invented Interior Designing Ideas
            </p>
            <p class="blog-latest-post_wrapper-text">
              Lorem ipsum dolor sit amet, adipiscing Aliquam eu sem vitae turpis
              dignissim maximus.posuere in.Contrary to popular belief.
            </p>
            <p class="blog-latest-post_wrapper-text_2">
              Lorem Ipsum is not simply random text. It has roots in a piece of
              classica.
            </p>

            <div class="blog-latest-post_wrapper-line">
              <span class="blog-latest-post_wrapper-line-text"
                >26 December, 2022</span
              >
              <button class="blog-latest-post_wrapper-line-btn">
                <img
                  class="follow-projects_grid-card_btn-arrow"
                  src="./../assets/imgs/arrow_circle.svg"
                  alt="pointer arrow icon"
                />
              </button>
            </div>
          </div>
        </div>
      </section>

      <section class="articles-news">
        <h2 class="articles-news_header">Articles & News</h2>

        <div id="blog-articles-news-container">
          <div v-for="(card, index) in cards" :key="index" :class="card.class">
            <template v-for="(value, key) in card.children">
              <template v-if="key !== 'children'">
                <component
                  v-if="value.type !== 'htmlContent'"
                  :is="value.type"
                  :class="value.class"
                  :src="value.src"
                  :alt="value.alt"
                  :key="key"
                ></component>
                <span
                  v-else-if="value.type === 'htmlContent'"
                  :class="value.class"
                  v-html="value.text"
                  :key="`level1_${index}_${value.text}`"
                ></span>
              </template>
              <div
                v-else-if="key === 'children'"
                :class="value.class"
                :key="`levelas1_${index}_${value.text}`"
              >
                <template v-for="(child, childIndex) in value">
                  <template v-if="child.type !== 'children'">
                    <component
                      v-if="child.type !== 'htmlContent'"
                      :is="child.type"
                      :class="child.class"
                      :src="child.src"
                      :alt="child.alt"
                      :key="childIndex"
                    ></component>
                    <span
                      v-else-if="child.type === 'htmlContent'"
                      :class="child.class"
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
                    <div :class="child.class">
                      <template
                        v-for="(grandchild, grandIndex) in child.children"
                      >
                        <template v-if="grandchild.type !== 'children'">
                          <component
                            v-if="grandchild.type !== 'htmlContent'"
                            :is="grandchild.type"
                            :class="grandchild.class"
                            :src="grandchild.src"
                            :alt="grandchild.alt"
                            :key="grandIndex"
                          ></component>
                          <span
                            v-else-if="grandchild.type === 'htmlContent'"
                            :class="grandchild.class"
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

      <div class="blog-news-paggination">
        <div class="blog-news-paggination_round-btn">
          <span class="blog-news-paggination_span">01</span>
        </div>
        <div class="blog-news-paggination_round-btn">
          <span class="blog-news-paggination_span">02</span>
        </div>
        <div class="blog-news-paggination_round-btn">
          <span class="blog-news-paggination_span">03</span>
        </div>
        <div class="blog-news-paggination_round-btn">
          <img
            src="./../assets/imgs/arrow_circle.svg"
            alt="circular btn arrow"
          />
        </div>
      </div>
    </main>
    <FooterComponent />
  </div>
</template>

<script>
import FooterComponent from "./FooterComponent.vue";
import HeaderComponent from "./HeaderComponent.vue";

export default {
  name: "BlogPage",
  components: {
    FooterComponent,
    HeaderComponent,
  },
  el: "#blog-articles-news-container",
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
      fetch("data.json")
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

<style lang="scss" scope>
@import "./../assets/styles/mixins/_mixins.scss";

.blog-hero {
  & img {
    width: 100%;
  }
  &_text-wrapper {
    @include centerFlex;
    flex-direction: column;
    max-width: 503px;
    height: 228px;
    background: white;
    border-radius: 2rem;
    margin-top: -12.5rem;
    position: relative;
    z-index: 2;
    margin-bottom: 160px;
  }
  &_header {
    color: #292f36;
    font-family: "DM Serif Display";
    font-size: 3.125rem;
    font-weight: 400;
    line-height: 125%;
    margin-top: -2rem;
  }
  &_span {
    color: #4d5053;
    font-family: "Jost";
    font-size: 1.375rem;
    font-weight: 400;
    line-height: 150%;
    letter-spacing: 0.01375rem;
  }
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

#blog-articles-news-container {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 1rem;
  margin-bottom: 41px;
}

.blog-news-paggination {
  display: flex;
  gap: 1rem;
  margin-bottom: 200px;
  &_round-btn {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 3.25rem;
    height: 3.25rem;
    flex-shrink: 0;
    border-radius: 10rem;
    border: 1px solid #cda274;
    transition: all 0.3s ease-in-out;
    &:hover {
      background-color: #f4f0ec;
      border: none;
      cursor: pointer;
    }
  }
  &_span {
    color: #292f36;
    font-family: Jost;
    font-size: 1rem;
    font-weight: 500;
    line-height: 150%;
    text-transform: capitalize;
  }
}
</style>
