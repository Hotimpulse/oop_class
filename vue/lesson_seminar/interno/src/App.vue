<template>
  <div>
    <HeaderComponent />
    <router-view />
    <FooterComponent />
  </div>
</template>

<script>
import HeaderComponent from "./components/HeaderComponent.vue";
import FooterComponent from "./components/FooterComponent.vue";

export default {
  name: "App",
  components: {
    HeaderComponent,
    FooterComponent
  },
  created() {
    this.$router.push({ name: "home" });
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
.router-link {
  text-decoration: none;
  list-style: none;
}
</style>
