<template>
  <div :class="$style.wrapper">
    <HeaderComponent />
    <main>
      <div :class="$style['details-hero']">
        <img
          :class="$style['details-hero-img']"
          src="./../assets/imgs/details_banner.jpg"
          alt="blog banner image"
        />
      </div>

      <div :class="$style['details-special']">
        <section id="details-posts">
          <div :class="$style['details-breaker']">
            <img
              :class="$style['details-breaker-svg']"
              src="./../assets/imgs/double-quotes.svg"
              alt="logo"
            />
            <span :class="$style['details-breaker-text']"
              >The details are not the details. They make the design.</span
            >
          </div>
        </section>
      </div>
    </main>
    <BlogComp />
    <FooterComponent />
  </div>
</template>

<script>
import FooterComponent from "../components/FooterComponent.vue";
import HeaderComponent from "../components/HeaderComponent.vue";
import BlogComp from "../components/BlogComp.vue";

export default {
  name: "IndexPage",
  components: {
    FooterComponent,
    HeaderComponent,
    BlogComp,
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
  display: flex;
  justify-content: center;
  align-items: center;
  margin: 0 auto;
  flex-direction: column;
  width: fit-content;
  padding: 0 5rem;
}
main {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  margin: 0 auto;
  margin-bottom: 2rem;
}
.details-hero {
  @include centerFlex;
  margin-bottom: 200px;
}
.details-hero-img {
  width: 100%;
}

.details-special {
  @include centerFlex;
  align-items: flex-start;
  gap: 2rem;
  flex-direction: column;
}

aside {
  margin-bottom: 2rem;
}

.details-latest-post {
  &_wrapper-img {
    margin-bottom: 46px;
    border-radius: 1rem;
    max-width: 768px;
  }
  &_headline {
    width: 684px;
    color: #292f36;
    font-family: "DM Serif Display";
    font-size: 3.125rem;
    font-weight: 400;
    line-height: 125%;
    letter-spacing: 0.0625rem;
    margin-bottom: 20px;
  }
  &_wrapper-breadcrumbs {
    display: flex;
    justify-content: space-between;
    margin-bottom: 3rem;
  }
  &_date {
    color: #4d5053;
    font-family: Jost;
    font-size: 1rem;
    font-weight: 400;
    line-height: 150%;
    letter-spacing: 0.01rem;
    text-transform: capitalize;
  }
  &_breadcrumbs {
    color: #4d5053;
    font-family: Jost;
    font-size: 1rem;
    font-weight: 400;
    line-height: 150%;
    letter-spacing: 0.01rem;
    text-transform: capitalize;
  }
  &_text {
    max-width: 799px;
    color: #4d5053;
    font-family: Jost;
    font-size: 1.375rem;
    font-style: normal;
    line-height: 150%;
    letter-spacing: 0.01375rem;
    margin-bottom: 2rem;
  }
  &_text-wrapper {
    display: flex;
    gap: 11rem;
  }
}

.details_tags {
  display: flex;
  flex-direction: column;
  gap: 1rem;
  max-width: 420px;
  height: 200px;
}

.details_tags_btn {
  max-width: 200px;
  border-radius: 0.625rem;
  background-color: #f4f0ec;
  border: none;

  color: #292f36;
  text-align: center;
  font-family: Jost;
  font-size: 1.125rem;
  line-height: 125%;
  letter-spacing: 0.0225rem;

  padding: 0.5625rem 1.875rem;
  transition: all 0.3s ease-in-out;
  &:hover {
    background: #292f36;
    cursor: pointer;
    color: white;
  }
}
.active {
  background: #292f36;
  color: white;
}

.btn-grid {
  display: grid;
  gap: 1rem;
  grid-template-columns: 1fr 1fr;
}

.details-breaker {
  display: flex;
  flex-direction: column;
  width: 799px;
  padding: 3.3125rem 14.1875rem;
  flex-direction: column;
  align-items: center;
  gap: 0.625rem;
  border-radius: 3.125rem;
  background: #f4f0ec;
  margin-bottom: 2rem;
}
.details-breaker-text {
  color: #cda274;
  text-align: center;
  font-family: "DM Serif Display";
  font-size: 1.5625rem;
  font-style: italic;
  line-height: 125%;
  letter-spacing: 0.03125rem;
}
</style>
