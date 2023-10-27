<template>
  <div>
    <h2>Product: {{ product.name }}</h2>
    <p>Price: {{ formattedPrice }}</p>
    <p>Availability: {{ isProductInStock }}</p>
  </div>
</template>

<script>
export default {
  data() {
    return {
      product: {
        id: 1,
        name: "T-Shirt",
        price: 99.99,
        available: true,
      },
    };
  },
  computed: {
    formattedPrice() {
      return `$` + this.product.price;
    },
    isProductInStock() {
      return this.product.available ? "Available" : "Out of stock";
    },
  },
};
</script>

<style></style>
