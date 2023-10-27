<template>
  <!-- <IndexPage />
  <BlogPage /> -->
  <BlogDetails />
</template>

<script>
// import IndexPage from "./components/IndexPage.vue";
// import BlogPage from "./components/BlogPage.vue";
import BlogDetails from "./pages/BlogDetails.vue";

export default {
  name: "App",
  components: {
    // IndexPage,
    // BlogPage,
    BlogDetails,
  },
};
</script>

<style lang="scss">
@font-face {
  font-family: "DM Serif Display";
  src: url("./assets/fonts/DM_Serif_Display/DMSerifDisplay-Regular.ttf");
}

@font-face {
  font-family: "Jost";
  src: url("./assets/fonts/Jost/Jost-VariableFont_wght.ttf");
}
</style>

