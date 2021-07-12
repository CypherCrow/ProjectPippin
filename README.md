# Project Pippin

A e-commerce and logistics application using the Neo blockchain. A submission for the 2021 Neo Frontier Blockchain launchpad hackathon.

The application uses Vue.js for frontend and Java for backend.

There are still some functionalities that need to be improved after the hackathon. However, for now, the front-end will mostly give you an idea on how this application works out. For further details, check the submission page. 

## Executing Project

### Frontend

To run the front-end, head to `/ProjectPippin/src/main/ui` run this command: 

`npm run serve`

### Backend

For deploying a contract, pick either contract in `/ProjectPipin/src/main/java/project/hackathon/jonah/pippin/contracts/`, and run this command: 

`.\gradlew neow3jCompile`

Make sure Neo Express is running before you deploy and invoke the contract of your choice. 
