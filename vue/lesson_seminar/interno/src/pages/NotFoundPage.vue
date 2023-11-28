<template>
  <div :class="$style['wrapper']">
    <h1 :class="$style['wrapper_header']">This page does not exist</h1>
    <router-link to="/">
      <span :class="$style['wrapper_text']">Home page</span>
    </router-link>
  </div>
</template>

<script>
export default {
  name: "NotFoundPage",
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
  gap: 5rem;
  &_header {
    color: #292f36;
    font-family: "DM Serif Display";
    font-size: 3.125rem;
    line-height: 125%;
    margin-top: 10rem;

  }
  &_text {
    color: #4d5053;
    font-family: "Jost";
    font-size: 2rem;
    line-height: 150%;
    letter-spacing: 0.01375rem;
  }
  margin-bottom: 10rem;
}
</style>
