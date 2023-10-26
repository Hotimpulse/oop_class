<template>
  <div class="$style.details-latest-post">
    <h1 class="$style.details-latest-post_headline">{{ title }}</h1>
    <p class="$style.details-latest-post_text">{{ content }}</p>
    <img
      class="$style.details-latest-post_wrapper-img"
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

</style>
