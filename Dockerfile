FROM node:10-buster

# Install Java and update
RUN apt-get update && apt-get install -y default-jdk libsecret-1-dev xvfb libx11-dev libxkbfile-dev maven libxml2-utils && apt-get upgrade -y

WORKDIR /coffee-editor

COPY . /coffee-editor

# Set location to place global npm dependencies
ENV NPM_CONFIG_PREFIX=/home/node/.npm-global

# Expose port
EXPOSE 3000
EXPOSE 8081

# Run command
RUN npm install -g yarn && npm install -g lerna

RUN ./run.sh -f

CMD ["sh", "-c", "./run.sh -r"]
