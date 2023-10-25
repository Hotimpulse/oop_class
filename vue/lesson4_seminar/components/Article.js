Vue.component('Article', {
    props: ['title', 'content', 'imgSrc', 'tags'],
    template: `
    <div class="details-latest-post">
        <h1 class="details-latest-post_headline">{{ title }}</h1>
        <p class="details-latest-post_text">{{ content }}</p>
        <img class="details-latest-post_wrapper-img" :src="imgSrc" :alt="'image for ' + title" />
    </div>
    `,
})