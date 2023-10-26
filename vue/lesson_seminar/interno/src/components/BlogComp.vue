<template>
  <div>
    <TagSystem
      :tags="getUniqueTags()"
      @filter="filterByTag"
      :selectedTag="selectedTag"
    />
    <Article
      v-for="article in displayedArticles"
      :key="article.title"
      :title="article.title"
      :content="article.content"
      :imgSrc="article.imgSrc"
    />
  </div>
</template>

<script>
import TagSystem from "./TagSystem.vue";

export default {
  components: {
    TagSystem,
  },
  data() {
    return {
      articles: [
        {
          title: "Design sprints are great for Architecture",
          content:
            "Lorem ipsum dolor sit amet, adipiscing Aliquam eu sem vitae turpmaximus...",
          imgSrc: "./imgs/kitchen_dets4.png",
          tags: ["architecture", "all"],
        },
        {
          title: "Let’s Get Solutions for Building Bedrooms",
          content:
            "Lorem ipsum dolor sit amet, adipiscing Aliquam eu sem vitae turpmaximus.posuere in.",
          imgSrc: "./imgs/kitchen_dets3.png",
          tags: ["building", "bedroom", "all"],
        },
        {
          title: "Are you into Kitchen Planning?",
          content:
            "Contrary to popular belief.There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injecthumour, or randomised words which don't look even slightly believable. Embarrassing hidden in the middle of text.",
          imgSrc: "./imgs/kitchen_dets1.png",
          tags: ["kitchen", "kitchen planning", "all"],
        },
        {
          title: "Enjoy stellar architecture? Look no further!",
          content:
            "All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary.",
          imgSrc: "./imgs/kitchen_dets5.png",
          tags: ["architecture", "all"],
        },
        {
          title: "Building a 4-bedroom house? Manage your expenses!",
          content:
            "Lorem ipsum dolor sit amet consectetur, adipisicing elit. Officiis, excepturi!",
          imgSrc: "./imgs/kitchen_dets2.png",
          tags: ["building", "bedroom", "all"],
        },
      ],
      displayedArticles: [],
      selectedTag: "",
    };
  },
  methods: {
    getUniqueTags() {
      const tags = new Set();
      this.articles.forEach((article) => {
        if (Array.isArray(article.tags)) {
          article.tags.forEach((tag) => tags.add(tag));
        } else {
          tags.add(article.tags);
        }
      });
      return Array.from(tags);
    },
    filterByTag(tag) {
      console.log("Received tag:", tag);
      this.selectedTag = tag;
      if (tag === "All") {
        this.displayedArticles = this.articles;
      } else {
        this.displayedArticles = this.articles.filter((article) => {
          return Array.isArray(article.tags)
            ? article.tags.includes(tag)
            : article.tags === tag;
        });
      }
    },
  },
};
</script>

<style module></style>
