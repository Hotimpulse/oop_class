<template>
  <section :class="$style['blog-hero']">
    <img src="./../assets/imgs/blog-banner.jpg" alt="blog banner image" />
    <div :class="$style['blog-hero_text-wrapper']">
      <h1 :class="$style['blog-hero_header']">{{ name }}</h1>
      <router-link to="/">
        <span :class="$style['blog-hero_span']">Home</span>
      </router-link>
    </div>
  </section>
</template>

<script>
export default {
  name: "BannerComponent",
  props: {
    name: String,
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
</style>
