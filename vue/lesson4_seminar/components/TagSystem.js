Vue.component('TagSystem', {
    props: ['tags', 'selectedTag'],
    template: `
    <aside class="details-tags">
        <h2 class="details_header">Tags</h2>
        <div class="btn-grid">
            <button
            v-for="tag in tags" 
            :class="{ 'details-tags_btn': true, 'active': tag === selectedTag }" 
            :key="tag" 
            @click="filterByTag(tag)">
            {{ tag }}</button>
        </div>
    </aside>
    `,
    methods: {
        filterByTag(tag) {
            this.$emit('filter', tag);
        },
    },
});