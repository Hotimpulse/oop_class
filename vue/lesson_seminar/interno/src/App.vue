<template>
  <IndexPage />
</template>

<script>
import "./assets/styles/mixins/_mixins.scss";
import "./assets/fonts/DM_Serif_Display/DMSerifDisplay-Regular.ttf";
import "./assets/fonts/Jost/Jost-VariableFont_wght.ttf";
import IndexPage from "./components/IndexPage.vue";

export default {
  name: "App",
  components: {
    IndexPage,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>

