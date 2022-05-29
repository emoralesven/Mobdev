# Mobdev
Desafio para postular al cargo de desarrollador backend, en donde se desarrolló una servicio el cual expone un endpoint que permite realizar una petición con el id de algún personaje de la serie Rick and Morty, https://rickandmortyapi.com.

## Como compilar y ejecutar el proyecto MobDev

Abrir Spring Tools Suite e importar el proyecto, luego ejecutar como aplicación spring boot.

## Para consumir el servicio en consola
	
	curl -X GET "http://localhost:8080/rickyandmorty/3" -H "accept: */*"


## Documentación mediante Swagger2

La documentación está disponible (mientras el proyecto esté en ejecución) en la siguiente url : http://localhost:8080/swagger-ui/

## Formato de respuesta JSON de la API desarrollada
		```
	{
	"$schema": "http://json-schema.org/draft-07/schema",
	"$id": "http://example.com/example.json",
	"type": "object",
	"required": [
	"id",
	"name",
	"status",
	"species",
	"type",
	"episode_count",
	"origin"
	],
	"properties": {
	"id": {
		"$id": "#/properties/id",
		"type": "integer"
	},
	"name": {
	"$id": "#/properties/name",
	"type": "string"
	},
	"status": {
	"$id": "#/properties/status",
	"type": "string"
	},
	"species": {
	"$id": "#/properties/species",
	"type": "string"
	},
	"type": {
	"$id": "#/properties/type",
	"type": "string"
	},
	"episode_count": {
	"$id": "#/properties/episode_count",
	"type": "integer"
	},
	"origin": {
	"$id": "#/properties/origin",
	"type": "object",
	"required": [
	"name",
	"url",
	"dimension",
	"residents"
	],
	"properties": {
	"name": {
	"$id": "#/properties/origin/properties/name",
	"type": "string"
	},
	"url": {
	"$id": "#/properties/origin/properties/url",
	"type": "string"
	},
	"dimension": {
	"$id": "#/properties/origin/properties/dimension",
	"type": "string"
	},
	"residents": {
	"$id": "#/properties/origin/properties/residents",
	"type": "array",
	"items": {
	"$id": "#/properties/origin/properties/residents/items",
	"type": "string"
	}
	}
	}
	}
	}
	}

```
