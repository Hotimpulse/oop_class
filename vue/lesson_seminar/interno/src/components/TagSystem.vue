<template>
  <aside class="$style.details-tags">
    <h2 class="$style.details_header">Tags</h2>
    <div class="$style.btn-grid">
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
  name: 'TagSystem',
  props: ["tags", "selectedTag"],
  methods: {
    filterByTag(tag) {
      this.$emit("filter", tag);
    },
  },
};
</script>

<style lang="scss" module>

</style>
