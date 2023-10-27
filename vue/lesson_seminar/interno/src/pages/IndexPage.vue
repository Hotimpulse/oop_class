<template>
  <div :class="$style.wrapper">
    <HeaderComponent />
    <main>
      <section :class="$style.hero">
        <div :class="$style['hero-wrapper']">
          <img src="./../assets/imgs/hero.png" alt="main hero image" />
          <h1 :class="$style.hero_header">Let Your Home Be Unique</h1>
          <p :class="$style.hero_paragraph">
            There are many variations of the passages of lorem Ipsum available,
            majority.
          </p>
          <button :class="$style.hero_btn">
            Get Started
            <img src="./../assets/imgs/arrow.svg" alt="arrow icon" />
          </button>
        </div>
      </section>

      <section :class="$style['follow-projects']">
        <div :class="$style['follow-projects_text-wrapper']">
          <h2 :class="$style['follow-projects_text-wrapper_header']">
            Follow Our Projects
          </h2>
          <p :class="$style['follow-projects_text-wrapper_text']">
            It is a long established fact that a reader will be distracted by
            the readable content of the page, focusing on its layout points.
          </p>
        </div>
        <div :class="$style['follow-projects_grid']">
          <div :class="$style['follow-projects_grid-card']">
            <img
              :class="$style['follow-projects_grid-card_img']"
              src="./../assets/imgs/kitchen1.png"
              alt="photo of a kitchen"
            />
            <div :class="$style['follow-projects_grid-card_wrapper']">
              <div :class="$style['follow-projects_text-wrap']">
                <h3>Modern Kitchen</h3>
                <p>Decor / Artchitecture</p>
              </div>
              <button :class="$style['follow-projects_grid-card_btn']">
                <img
                  :class="$style['follow-projects_grid-card_btn-arrow']"
                  src="./../assets/imgs/arrow_circle.svg"
                  alt="pointer arrow icon"
                />
              </button>
            </div>
          </div>

          <div :class="$style['follow-projects_grid-card']">
            <img
              :class="$style['follow-projects_grid-card_img']"
              src="./../assets/imgs/kitchen2.png"
              alt="photo of a kitchen"
            />
            <div :class="$style['follow-projects_grid-card_wrapper']">
              <div :class="$style['follow-projects_text-wrap']">
                <h3>Modern Kitchen</h3>
                <p>Decor / Artchitecture</p>
              </div>
              <button :class="$style['follow-projects_grid-card_btn']">
                <img
                  :class="$style['follow-projects_grid-card_btn-arrow']"
                  src="./../assets/imgs/arrow_circle.svg"
                  alt="pointer arrow icon"
                />
              </button>
            </div>
          </div>
          <div :class="$style['follow-projects_grid-card']">
            <img
              :class="$style['follow-projects_grid-card_img']"
              src="./../assets/imgs/kitchen3.png"
              alt="photo of a kitchen"
            />
            <div :class="$style['follow-projects_grid-card_wrapper']">
              <div :class="$style['follow-projects_text-wrap']">
                <h3>Modern Kitchen</h3>
                <p>Decor / Artchitecture</p>
              </div>
              <button :class="$style['follow-projects_grid-card_btn']">
                <img
                  :class="$style['follow-projects_grid-card_btn-arrow']"
                  src="./../assets/imgs/arrow_circle.svg"
                  alt="pointer arrow icon"
                />
              </button>
            </div>
          </div>
          <div :class="$style['follow-projects_grid-card']">
            <img
              :class="$style['follow-projects_grid-card_img']"
              src="./../assets/imgs/kitchen4.png"
              alt="photo of a kitchen"
            />
            <div :class="$style['follow-projects_grid-card_wrapper']">
              <div :class="$style['follow-projects_text-wrap']">
                <h3>Modern Kitchen</h3>
                <p>Decor / Artchitecture</p>
              </div>
              <button :class="$style['follow-projects_grid-card_btn']">
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

      <section :class="$style.stats">
        <div :class="$style.stats_point">
          12
          <span :class="$style.stats_text">Years Of Experience</span>
        </div>
        <span :class="$style.stats_line"></span>
        <div :class="$style.stats_point">
          85

          <span :class="$style.stats_text">Success Projects</span>
        </div>
        <span :class="$style.stats_line"></span>
        <div :class="$style.stats_point">
          15

          <span :class="$style.stats_text">Active Projects</span>
        </div>
        <span :class="$style.stats_line"></span>
        <div :class="$style.stats_point">
          95

          <span :class="$style.stats_text">Happy Customers</span>
        </div>
      </section>

      <section :class="$style['articles-news']">
        <h2 :class="$style['articles-news_header']">Articles & News</h2>
        <p :class="$style['articles-news_text']">
          It is a long established fact that a reader will be distracted by the
          of readable content of a page when lookings at its layouts the points
          of using.
        </p>
        <div :class="$style['articles-news-container']">
          <div :class="$style['articles-news-card']">
            <img
              :class="$style['articles-news-card_img']"
              src="./../assets/imgs/card_kitchen1.png"
              alt="photo of a kitchen"
            />
            <div :class="$style['articles-news-card_plaque']">
              Kitchen Design
            </div>
            <h3 :class="$style['articles-news-card_header']">
              Let’s Get Solution For Building Construction Work
            </h3>
            <div :class="$style['articles-news-card_wrapper']">
              <p :class="$style['articles-news-card_text']">
                26 December, 2022
              </p>
              <button :class="$style['articles-news-card_btn']">
                <img
                  :class="$style['follow-projects_grid-card_btn-arrow']"
                  src="./../assets/imgs/arrow_circle.svg"
                  alt="pointer arrow icon"
                />
              </button>
            </div>
          </div>

          <div :class="$style['articles-news-card']">
            <img
              :class="$style['articles-news-card_img']"
              src="./../assets/imgs/card_kitchen2.png"
              alt="photo of a kitchen"
            />
            <div :class="$style['articles-news-card_plaque']">
              Living Design
            </div>
            <h3 :class="$style['articles-news-card_header']">
              Low Cost Latest Invented Interior Designing Ideas.
            </h3>
            <div :class="$style['articles-news-card_wrapper']">
              <p :class="$style['articles-news-card_text']">
                22 December, 2022
              </p>
              <button :class="$style['articles-news-card_btn']">
                <img
                  :class="$style['follow-projects_grid-card_btn-arrow']"
                  src="./../assets/imgs/arrow_circle.svg"
                  alt="pointer arrow icon"
                />
              </button>
            </div>
          </div>

          <div :class="$style['articles-news-card']">
            <img
              :class="$style['articles-news-card_img']"
              src="./../assets/imgs/card_kitchen3.png"
              alt="photo of a kitchen"
            />
            <div :class="$style['articles-news-card_plaque']">
              Interior Design
            </div>
            <h3 :class="$style['articles-news-card_header']">
              Best For Any Office & Business Interior Solution
            </h3>
            <div :class="$style['articles-news-card_wrapper']">
              <p :class="$style['articles-news-card_text']">
                25 December, 2022
              </p>
              <button :class="$style['articles-news-card_btn']">
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
    </main>
    <FooterComponent />
  </div>
</template>

<script>
import HeaderComponent from "../components/HeaderComponent.vue";
import FooterComponent from "../components/FooterComponent.vue";

export default {
  name: "IndexPage",
  components: {
    HeaderComponent,
    FooterComponent,
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

main {
  @include centerFlex;
  flex-direction: column;
  padding: 0 5rem;
}

.hero {
  position: relative;
  margin-bottom: 96px;
  &_header {
    width: 434px;
    color: #292f36;
    font-family: "DM Serif Display";
    font-size: 4.0625rem;
    font-weight: 400;
    line-height: 125%;

    position: absolute;
    top: 208px;
    left: 52px;
  }
  &_paragraph {
    width: 434px;
    color: #4d5053;
    font-family: Jost;
    font-size: 1.375rem;
    font-weight: 400;
    line-height: 150%;
    letter-spacing: 0.01375rem;

    position: absolute;
    top: 388px;
    left: 52px;
  }
  &_btn {
    display: flex;
    justify-content: center;
    align-items: center;
    gap: 1rem;

    width: 220px;
    height: 75px;
    border-radius: 18px;
    border: none;

    margin-top: 1rem;

    text-align: center;
    font-family: Jost;
    font-size: 1.125rem;
    font-weight: 600;
    line-height: 125%;
    letter-spacing: 0.0225rem;

    color: white;
    background-color: #292f36;
    box-shadow: 1px 1px 11px 1px rgba(#cda274, 0.432);
    position: absolute;
    top: 475px;
    left: 52px;
    cursor: pointer;
    transition: all 0.3s ease-in-out;
    &:hover {
      background-color: #fff;
      color: #292f36;
      box-shadow: 1px 1px 4px 1px rgba(#292f36, 0.2);
    }
  }
}

.hero-wrapper {
  display: flex;
  gap: 1rem;
}

.follow-projects {
  display: flex;
  flex-direction: column;
  margin-bottom: 96px;
  &_grid {
    display: grid;
    grid-template-columns: 1fr 1fr;
    gap: 56px;
  }
  &_text-wrapper {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    margin: 0 auto;
    width: 737px;
    margin-bottom: 93px;
    &_header {
      color: #292f36;
      text-align: center;
      font-family: "DM Serif Display";
      font-size: 3.125rem;
      font-weight: 400;
      line-height: 125%;
      letter-spacing: 0.0625rem;
    }

    &_text {
      color: #4d5053;
      text-align: center;
      font-family: Jost;
      font-size: 1.375rem;
      font-weight: 400;
      line-height: 150%;
      letter-spacing: 0.01375rem;
    }
  }
  &_grid-card {
    display: flex;
    flex-direction: column;
    width: 550px;
    &_img {
      width: 525px;
      height: 548px;
      margin-bottom: 24px;
    }
    &_wrapper {
      display: flex;
      justify-content: space-between;
      width: 525px;
    }
    & h3 {
      color: #292f36;
      font-family: "DM Serif Display";
      font-size: 1.5625rem;
      font-weight: 400;
      line-height: 125%;
      letter-spacing: 0.03125rem;
      grid-column: 1 / span 4;
    }
    & p {
      color: #4d5053;
      font-family: Jost;
      font-size: 1.375rem;
      font-weight: 400;
      line-height: 150%;
      letter-spacing: 0.01375rem;
      grid-column: 1 / span 1;
    }
    &_btn {
      grid-column: 2;
      justify-content: center;
      align-items: center;
      width: 70px;
      height: 70px;
      border-radius: 10rem;
      border: none;
      background: #f4f0ec;
      cursor: pointer;
      &:hover {
        background-color: #4d5053b6;
      }
    }
    &_btn-arrow {
      width: 8px;
      height: 18px;
    }
  }
  &_text-wrap {
    display: flex;
    flex-direction: column;
  }
}

.stats {
  display: flex;
  width: 100%;
  gap: 54px;
  justify-content: center;
  align-items: center;
  background-color: #f4f0ec;
  height: 28.5625rem;
  margin-bottom: 96px;
  &_point {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    color: #cda274;
    font-family: "DM Serif Display";
    font-size: 5.3125rem;
    font-weight: 400;
    line-height: 125%;
    letter-spacing: 0.10625rem;
  }
  &_line {
    background: #cda274;
    width: 0.0625rem;
    height: 8.125rem;
  }
  &_text {
    color: #4d5053;
    font-family: Jost;
    font-size: 1.375rem;
    font-weight: 400;
    line-height: 150%;
    letter-spacing: 0.01375rem;
  }
}

.articles-news {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  margin: 0 auto;
  &_header {
    color: #292f36;
    text-align: center;
    font-family: "DM Serif Display";
    font-size: 3.125rem;
    font-weight: 400;
    line-height: 125%;
    letter-spacing: 0.0625rem;
    margin-bottom: 12px;
  }
  &_text {
    color: #4d5053;
    text-align: center;
    font-family: Jost;
    font-size: 1.375rem;
    font-weight: 400;
    line-height: 150%;
    letter-spacing: 0.01375rem;
    margin-bottom: 52px;
  }
}

.articles-news-container {
  display: flex;
  gap: 27px;
  margin-bottom: 96px;
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
    text-transform: capitalize;

    position: relative;
    margin-top: -5rem;
    margin-left: 1rem;
    margin-bottom: 2rem;
  }
  &_header {
    color: #292f36;
    font-family: "DM Serif Display";
    font-size: 1.5625rem;
    font-weight: 400;
    line-height: 125%;
    letter-spacing: 0.03125rem;
    margin-bottom: 30px;
  }

  &_text {
    color: #4d5053;
    font-family: Jost;
    font-size: 1rem;
    font-weight: 400;
    line-height: 150%;
    letter-spacing: 0.01rem;
    text-transform: capitalize;
  }
  &_wrapper {
    display: flex;
    justify-content: space-between;
    align-items: center;
  }
  &_btn {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 52px;
    height: 52px;
    border-radius: 50px;
    border: none;
    cursor: pointer;
    &:hover {
      background-color: #4d505373;
    }
  }
}
</style>
