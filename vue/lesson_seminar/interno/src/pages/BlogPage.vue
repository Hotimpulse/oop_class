<template>
  <div :class="$style.wrapper">
    <BannerComponent :name="`Articles & News`" />
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
            :class="$style['articles-news-card']"
          >
            <img
              :src="card.children[0].src"
              :alt="card.children[0].alt"
              :class="$style['articles-news-card_img']"
            />
            <div class="$style['articles-news-card_plaque']">
              {{ card.children[1].text }}
            </div>
            <h3 :class="$style['articles-news-card_header']">
              {{ card.children[2].text }}
            </h3>
            <div :class="$style['articles-news-card_wrapper']">
              <p :class="$style['articles-news-card_text']">
                {{ card.children[3].children[0].text }}
              </p>
              <button :class="$style['articles-news-card_btn']">
                <img
                  :src="card.children[3].children[1].children[0].src"
                  :alt="card.children[3].children[1].children[0].alt"
                  :class="$style['follow-projects_grid-card_btn-arrow']"
                />
              </button>
            </div>
          </div>
        </div>
      </section>

      <PaginationComponent :items="['01', '02', '03']" />
    </main>
  </div>
</template>

<script>
import BannerComponent from "@/components/BannerComponent.vue";
import PaginationComponent from "@/components/PaginationComponent.vue";

export default {
  name: "BlogPage",
  components: {
    BannerComponent,
    PaginationComponent,
  },
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
    getImageSrc(card) {
      return card.children[0].src.startsWith("/")
        ? card.children[0].src
        : `/assets${card.children[0].src}`;
    },
    getArrowSrc(card) {
      return card.children[4].children[0].src.startsWith("/")
        ? card.children[4].children[0].src
        : `/assets${card.children[4].children[0].src}`;
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

.articles-news_header {
  color: #292f36;
  font-family: "DM Serif Display";
  font-size: 50px;
  line-height: 125%;
  letter-spacing: 1px;
}

.blog-articles-news-container {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 1rem;
  margin-bottom: 41px;
}
.articles-news-card {
  display: flex;
  flex-direction: column;
  width: 382px;
  height: 521px;
  border-radius: 62px;
  background-color: #e7e7e7;
  padding: 1.5rem;
  margin-top: 1rem;
  &_img {
    height: 289px;
    margin-bottom: 21px;
  }
  &_plaque {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 7.75rem;
    height: 2.5625rem;
    flex-shrink: 0;
    border-radius: 0.5rem 0.5rem 0.5rem 0rem;
    background: #fff;
    color: #4d5053;
    font-family: Jost;
    font-size: 1rem;
    font-weight: 400;
    line-height: 150%;
    letter-spacing: 0.01rem;
    position: relative;
    margin-top: -5rem;
    margin-left: 1rem;
    margin-bottom: 2rem;
  }
  &_header {
    color: #292f36;
    font-family: "DM Serif Display";
    font-size: 25px;
    line-height: 125%;
    letter-spacing: 0.5px;
  }
  &_wrapper {
    display: flex;
    justify-content: space-between;
    align-items: center;
  }
  &_text {
    color: #4d5053;
    font-family: Jost;
    font-size: 16px;
    line-height: 150%;
    letter-spacing: 0.16px;
  }
  &_btn {
    width: 52px;
    height: 52px;
    border-radius: 10rem;
    border: none;
    background: #f4f0ec;
  }
  &_btn-arrow {
    width: 8px;
    height: 18px;
  }
}
</style>
