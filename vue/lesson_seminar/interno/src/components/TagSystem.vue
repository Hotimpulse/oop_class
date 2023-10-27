<template>
  <aside :class="$style['details-tags']">
    <h2 :class="$style.details_header">Tags</h2>
    <div :class="$style['btn-grid']">
      <button
        v-for="tag in tags"
        :class="{
          '$style.details-tags_btn': true,
          '$style.active': tag === selectedTag,
        }"
        :key="tag"
        @click="filterByTag(tag)"
      >
        {{ tag }}
      </button>
    </div>
  </aside>
</template>

<script>
export default {
  name: "TagSystem",
  props: ["tags", "selectedTag"],
  methods: {
    filterByTag(tag) {
      this.$emit("filter", tag);
    },
  },
};
</script>

<style lang="scss" module>
aside {
  margin-bottom: 2rem;
}
.details-tags {
  display: flex;
  flex-direction: column;
  gap: 1rem;
  max-width: 420px;
  height: 200px;
  &_btn {
    max-width: 200px;
    border-radius: 0.625rem;
    background-color: #f4f0ec;
    border: none;

    color: #292f36;
    text-align: center;
    font-family: Jost;
    font-size: 1.125rem;
    line-height: 125%;
    letter-spacing: 0.0225rem;

    padding: 0.5625rem 1.875rem;
    transition: all 0.3s ease-in-out;
    &:hover {
      background: #292f36;
      cursor: pointer;
      color: white;
    }
  }
}

.active {
  background: #292f36;
  color: white;
}

.btn-grid {
  display: grid;
  gap: 1rem;
  grid-template-columns: 1fr 1fr;
}
</style>

