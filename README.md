# Guide de fonctionnement du projet


## Table des matières

* [Lambda FirstLambda](#firstLambda)
* [API Gateway](#api-gateway)



### Lambda FirstLambda
<p>
La lambda FirstLambda permet d'afficher un message lors de l'appel de la méthode <b>handleRequest()</b>. <br/>
Le but de cette lambda est de tester le déploiement sur AWS et la communication avec l'API Gateway en utilisant le protocole REST. <br/><br/>
Voici une capture du test unitaire lancer sur la plateforme AWS après déploiement.
</p>

![Alt text](/img/testUnitAws.png?raw=true)
<p>

</p>

#### API Gateway

<p>
L'API Gateway est configuré sur la plateforme AWS pour gérer les appels Get entrante a FirstLambda
</p>

![Alt text](/img/apiGateway.png?raw=true)

<p>Et voici une capture d'un appel Get avec postman</p>

![Alt text](/img/testPostman.png?raw=true)

<p>les fonctions Lambda sont surveillés automatiquement et les logs sont envoyés à Amazon CloudWatch.<br/>
Voici une capture d'un message de test sur le log</p>

![Alt text](/img/testLog.png?raw=true)