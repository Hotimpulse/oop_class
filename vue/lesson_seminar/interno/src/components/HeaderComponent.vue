<template>
  <div :class="$style['header-wrapper']">
    <div :class="$style['header-wrapper-logo']">
      <a href="./index.html">
        <img
          :class="$style['header-wrapper-logo-svg']"
          src="./../assets/imgs/Logo.svg"
          alt="Interno logo"
        />
        <span :class="$style['header-wrapper-text']">Interno</span>
      </a>
    </div>
    <nav :class="$style.nav">
      <li><a href="./../assets/pages/index.html">Home</a></li>
      <li><a href="#">Project</a></li>
      <li><a href="./../assets/pages/blog.html">Blog</a></li>
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
@mixin centerFlex {
  display: flex;
  justify-content: center;
  align-items: center;
  margin: 0 auto;
}

.wrapper {
  @include centerFlex;
  flex-direction: column;
  width: fit-content;
  padding: 0 5rem;
}

.header-wrapper {
  @include centerFlex;
  margin-top: 44px;

  width: 100%;
  height: 50px;
  margin-bottom: 57px;
  & a {
    text-decoration: none;
  }
}

.header-wrapper-text {
  color: #292f36;
  font-family: "DM Serif Display";
  font-size: 2.5rem;
  line-height: 125%;
}

.header-wrapper-logo {
  @include centerFlex;
}
.header-wrapper-logo-svg {
  width: 2.12488rem;
  height: 2.125rem;
  margin-right: 1rem;
}

.nav {
  @include centerFlex;
  padding: 0 5rem;
  & li {
    list-style: none;
    padding: 1rem;
  }

  & a {
    text-decoration: none;
    color: #292f36;
    font-family: Jost;
    font-size: 1.25rem;
    font-weight: 400;
    line-height: 125%;
  }
}
</style>

