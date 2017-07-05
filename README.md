если у вас LINUX OR MAC os

Чтобы скачать с гитхаба проект запускаем команду:
    git clone https://github.com/KanatbekAdilbayev/Greetgo.git
В файле:
    GreeGo oткрываем папку greetgo на Intellij idea и т.п.
В  терминале LINUX или MAC: 
    Запустем mysql -u root -p
Создадим user user:
    CREATE USER 'user'@'localhost' IDENTIFIED BY 'diasaga';
Так же создадим базу db_Kana:
    create database db_Kana;
    use db_Kana;

Дадим доступ user user:
    GRANT ALL PRIVILEGES ON db_Kana . * TO 'user'@'localhost';
Запускаем GreetgoApplication.java. После запуска сервера, заходим в браузер по адресу:
    http://localhost:8080
И видим результат:
    Hello world
Чтобы изменить в датабазе:
    http://localhost:8080/edit?letter= (любое слово)
После изменение слов, заходим в браузер по адресу:
    http://localhost:8080
И видим результат:
    (любое слово) 
    
  
  
