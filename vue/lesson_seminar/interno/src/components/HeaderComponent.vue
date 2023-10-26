<template>
  <div class="$style.header-wrapper">
    <div class="$style.header-wrapper-logo">
      <a href="./index.html">
        <img
          class="$style.header-wrapper-logo_svg"
          src="./../assets/imgs/Logo.svg"
          alt="Interno logo"
        />
        <span class="$style.header-wrapper_text">Interno</span>
      </a>
    </div>
    <nav>
      <li><a href="./index.html">Home</a></li>
      <li><a href="#">Project</a></li>
      <li><a href="./blog.html">Blog</a></li>
    </nav>
  </div>
</template>

<script>

export default {
  name: "HeaderComponent",
  components: {},
};
</script>

<style lang="scss" module>
@use './../assets/styles/mixins/_mixins.scss';

.wrapper {
  @include mixins.centerFlex;
  flex-direction: column;
  width: fit-content;
  padding: 0 5rem;
}

.header-wrapper {
  @include mixins.centerFlex;
  margin-top: 44px;

  width: 100%;
  height: 50px;
  margin-bottom: 57px;
  &_text {
    color: #292f36;
    font-family: "DM Serif Display";
    font-size: 2.5rem;
    line-height: 125%;
  }
  & a {
    text-decoration: none;
  }
}

.header-wrapper-logo {
  @include mixins.centerFlex;
  &_svg {
    width: 2.12488rem;
    height: 2.125rem;
    margin-right: 1rem;
  }
}

nav {
  @include mixins.centerFlex;
  padding: 0 5rem;
  & li {
    list-style: none;
    padding: 1rem;

    & a {
      text-decoration: none;
      color: #292f36;
      font-family: Jost;
      font-size: 1.25rem;
      font-weight: 400;
      line-height: 125%;
    }
  }
}
</style>

