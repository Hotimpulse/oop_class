const imgEndPoint = `https://www.artic.edu/iiif/2`;
let imgEndPoint2 = `full/843,/0/default.jpg`;
let imgArray = [];

// UI
const wrapperDiv = document.createElement('div');
wrapperDiv.setAttribute('id', 'wrapper');
document.body.appendChild(wrapperDiv);
const cardGrid = document.createElement('div');
cardGrid.setAttribute('id', 'grid');
wrapperDiv.appendChild(cardGrid);

cardGrid.style.gridTemplateColumns = 'repeat(3, 1fr)';
cardGrid.style.gridTemplateRows = 'repeat(4, 1fr)';

async function populateCardsWithData() {
    const response = await fetch(`https://api.artic.edu/api/v1/artworks`);
    const data = await response.json();
    // getting the images
    for (let i = 0; i < data.data.length; i++) {
        if (data.data[i].image_id !== null) {
            imgArray.push(data.data[i].image_id);
        }
    }

    // getting the title and the artist's name
    for (let i = 0; i < data.data.length; i++) {
        const card = document.createElement('div');
        card.setAttribute('id', 'card');
        const title = document.createElement('span');
        title.textContent = `${data.data[i].title}`;
        card.appendChild(title);
        const artistName = document.createElement('p');
        artistName.textContent = `${data.data[i].artist_display}`;
        const picture = document.createElement('img');
        picture.setAttribute('id', 'picture');
        picture.src = `${imgEndPoint}/${imgArray[i]}/${imgEndPoint2}`;
        card.appendChild(picture);
        card.appendChild(artistName);
        cardGrid.appendChild(card);
    }
}

populateCardsWithData();
