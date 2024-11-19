# kafka

Этот проект демонстрирует, как создавать и управлять микросервисами с использованием Spring Boot, реализовывать обнаружение сервисов и обрабатывать синхронную и асинхронную коммуникацию между сервисами с помощью Apache Kafka. Он включает в себя гейтвей для маршрутизации запросов, обнаружение сервисов для бесшовной взаимодействия сервисов и цепочки ошибок для обеспечения надежной синхронной коммуникации.

## Технологии, используемые
Spring Boot
Apache Kafka

## Как начать работу
Клонируйте репозиторий
Настройте Kafka и ZooKeeper (предоставлены инструкции в статье)
Постройте и запустите проект с помощью Spring Boot
### Запуск проекта
Установка
brew install zookeeper
brew install kafka  
Запустите Kafka и ZooKeeper 
brew services start ZooKeeper
brew services start kafka - старт
brew services restart ZooKeeper - перезапуск
brew services restart kafka 

brew services info kafka получить информацию
brew services info kafka --json  

Запустите каждый микросервис с использованием Spring Boot

### Справочная информация

Основные концепции Kafka
Kafka - это распределенная система обмена сообщениями и потоковой обработки данных.
Основные компоненты:
Брокеры (servers) - узлы кластера Kafka
Продюсеры (producers) - клиенты, отправляющие сообщения в Kafka
Консьюмеры (consumers) - клиенты, читающие сообщения из Kafka
Топики (topics) - категории для публикации и подписки на сообщения
Топики делятся на партиции (partitions), которые распределяются между брокерами.
Kafka использует паттерн publish-subscribe для обмена сообщениями.
Продюсеры
Клиенты, отправляющие сообщения в Kafka
Выбирают топик и партицию для записи сообщения
Обеспечивают надежность доставки сообщений
Консьюмеры
Клиенты, читающие сообщения из Kafka
Читают сообщения из партиций топика
Группы консьюмеров позволяют горизонтально масштабировать обработку данных
Топики и партиции
Топики - категории для организации сообщений
Партиции - логические файлы в топике
Распределение партиций между брокерами обеспечивает масштабируемость и отказоустойчивость
Кластер Kafka
Состоит из одного или нескольких брокеров
Брокеры обмениваются информацией о состоянии кластера
Один брокер служит контроллером для управления кластером
ZooKeeper
Централизованное хранилище метаданных кластера Kafka
Управляет выборами контроллера и лидеров партиций
Kafka Connect
Фреймворк для интеграции внешних систем с Kafka
Kafka Streams
API для потоковой обработки данных в Kafka
Таким образом, Kafka предоставляет мощный и масштабируемый механизм обмена сообщениями и потоковой обработки данных с поддержкой распределенных систем.
