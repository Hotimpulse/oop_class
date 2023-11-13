<template>
  <div>
    Sum of all payments: {{ getFullValue }}
    <div v-for="item in items" :key="item.id">
      {{ item }}
    </div>
  </div>
</template>

<script>
export default {
  name: "PaymentsDisplay",
  props: {
    items: {
      type: Array,
      default() {
        return [];
      },
    },
  },

  data() {
    return {};
  },
  computed: {
    getFullValue() {
      return this.$store.getters.getFullPayment;
    },
  },
};
</script>

<style></style>
