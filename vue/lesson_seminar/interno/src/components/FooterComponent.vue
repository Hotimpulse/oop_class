<template>
  <footer class="$style.footer">
    <div class="$style.footer_column">
      <div class="$style.footer_logo-wrapper">
        <img
          class="$style.footer_logo"
          src="./../assets/imgs/Logo.svg"
          alt="logo"
        />
        <span class="$style.footer_logo-text">Interno</span>
      </div>
      <p class="$style.footer_logo-description">
        It is a long established fact that a reader will be distracted while
        browsing.
      </p>
      <div class="$style.footer_svg-wrapper">
        <object
          class="$style.footer_twitter-logo"
          data="./../assets/imgs/twitter_icon.svg"
          type="image/svg+xml"
        ></object>
        <object
          class="$style.footer_li-logo"
          data="./../assets/imgs/linkedin_icon.svg"
          type="image/svg+xml"
        ></object>
      </div>
    </div>

    <div class="$style.footer_column">
      <h4 class="$style.footer_header">Pages</h4>
      <li class="$style.footer_list">
        <a href="./../pages/index.html">Home</a>
      </li>
      <li class="$style.footer_list">
        <a href="#">Project</a>
      </li>
      <li class="$style.footer_list">
        <a href="./../pages/blog.html">Blog</a>
      </li>
    </div>

    <div class="$style.footer_column">
      <h4 class="$style.footer_header">Contact</h4>
      <p class="$style.footer_text">
        55 East Birchwood Ave. Brooklyn, New York 11201
      </p>
      <p class="$style.footer_text">contact@interno.com</p>
      <p class="$style.footer_text">(123) 456 - 7890</p>
    </div>
  </footer>
</template>

<script>
export default {
  name: "FooterComponent",
  components: {},
};
</script>

<style lang="scss" module>
.footer {
  display: flex;
  justify-content: center;
  margin: 0 auto;
  align-items: flex-start;
  gap: 200px;
  margin-bottom: 120px;
  padding: 0 5rem;
  &_column {
    display: flex;
    flex-direction: column;
  }
  &_logo-wrapper {
    display: flex;
    gap: 1rem;
    justify-content: flex-start;
    align-items: center;
    margin-bottom: 18px;
  }
  &_logo {
    width: 34px;
    height: 34px;
  }
  &_logo-text {
    color: #292f36;
    font-family: "DM Serif Display";
    font-size: 2.5rem;
    font-weight: 400;
    line-height: 125%;
  }
  &_logo-description {
    width: 393px;
    color: #4d5053;
    font-family: Jost;
    font-size: 1.375rem;
    font-weight: 400;
    line-height: 150%;
    letter-spacing: 0.01375rem;
    margin-bottom: 31px;
  }
  &_svg-wrapper {
    display: flex;
    gap: 1rem;
    width: 225px;
  }
  &_footer_twitter-logo {
    width: 18px;
    height: 22px;
  }
  &_footer_li-logo {
    width: 18px;
    height: 22px;
  }
  &_header {
    margin-bottom: 20px;
    font-family: "DM Serif Display";
    font-size: 1.5625rem;
    font-weight: 400;
    line-height: 125%;
  }
  &_list {
    list-style: none;
    color: #4d5053;
    font-family: Jost;
    font-size: 1.375rem;
    font-weight: 400;
    line-height: 300%;
    letter-spacing: 0.01375rem;
    & a {
      text-decoration: none;
      color: #292f36;
    }
  }
  &_text {
    color: #4d5053;
    font-family: Jost;
    font-size: 1.375rem;
    font-weight: 400;
    line-height: 150%;
    letter-spacing: 0.01375rem;
  }
}
</style>

