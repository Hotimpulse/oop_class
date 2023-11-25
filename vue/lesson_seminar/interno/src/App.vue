<template>
  <!-- <IndexPage />
  <BlogDetails /> -->
  <!-- <BlogPage /> -->
  <!-- <ProjectPage /> -->
  <ProjectDetails />
</template>

<script>
// import IndexPage from "./components/IndexPage.vue";
// import BlogPage from "./pages/BlogPage.vue";
// import BlogDetails from "./pages/BlogDetails.vue";
// import ProjectPage from "./pages/ProjectPage.vue";
import ProjectDetails from "./pages/ProjectDetails.vue";

export default {
  name: "App",
  components: {
    // IndexPage,
    // BlogPage,
    // BlogDetails,
    // ProjectPage,
    ProjectDetails,
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
