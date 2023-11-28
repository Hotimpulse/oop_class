<template>
  <div class="blog-news-pagination">
    <div
      v-for="(item, index) in items"
      :key="index"
      class="blog-news-pagination_round-btn"
    >
      <span class="blog-news-pagination_span">{{ item }}</span>
    </div>
    <div class="blog-news-pagination_round-btn">
      <img
        v-if="showArrow"
        src="./../assets/imgs/arrow_circle.svg"
        alt="circular btn arrow"
      />
    </div>
  </div>
</template>

<script>
export default {
  name: "PaginationComponent",
  props: {
    items: {
      type: Array,
      required: true,
    },
    showArrow: {
      type: Boolean,
      default: true,
    },
  },
};
</script>

<style lang="scss">
@mixin centerFlex {
  display: flex;
  justify-content: center;
  align-items: center;
  margin: 0 auto;
}

.blog-news-pagination {
  @include centerFlex;
  gap: 1rem;
  margin-bottom: 200px;
  &_round-btn {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 3.25rem;
    height: 3.25rem;
    flex-shrink: 0;
    border-radius: 10rem;
    border: 1px solid #cda274;
    transition: all 0.3s ease-in-out;
    &:hover {
      background-color: #f4f0ec;
      border: none;
      cursor: pointer;
    }
  }
  &_span {
    color: #292f36;
    font-family: Jost;
    font-size: 1rem;
    font-weight: 500;
    line-height: 150%;
    text-transform: capitalize;
  }
}
</style>
