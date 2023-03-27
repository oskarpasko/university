-- Napisać tworzenie struktuty tabeli "questions"

CREATE TABLE questions(
    id int PRIMATY KEY AUTO_INCREMENT,
    email varchar(54) NOT NULL,
    offer_type varchar(15) NOT NULL,
    budget numeric(9, 2) NOT NULL,
    comment varchar(255) NOT NULL
)