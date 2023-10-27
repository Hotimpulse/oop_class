<template>
  <div :class="$style['details-latest-post']">
    <h1 :class="$style['details-latest-post_headline']">{{ title }}</h1>
    <p :class="$style['details-latest-post_text']">{{ content }}</p>
    <img
      :class="$style['details-latest-post_wrapper-img']"
      :src="imgSrc"
      :alt="'image for ' + title"
    />
  </div>
</template>

<script>
export default {
  name: "ArticleComp",
  props: ["title", "content", "imgSrc", "tags"],
  
};
</script>

<style lang="scss" module>
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
</style>

