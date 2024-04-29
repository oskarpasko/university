library(readxl)
linelist_raw <- read_excel("Documents/GitHub/University/6semestr/rStudio/linelist_raw.xlsx")
View(linelist_raw)

seq.int(1, 20)
seq.int(20,1)
seq.int(2,50,2)
seq.int(17,1000,17)
c(seq.int(1,20,1), seq.int(19,1,-1))
rep(c(4,6,3),10)
rep(c(4,6,3), each=10)

a <- seq.int(17,1000,17)
a[-1:-5]

a = seq.int(1,100,1)
a*c(1,-1)

# lista

# ramki danych
emp_id = 1:50
emp_name= sample(x=c("R", "D", "A", "S", "J", "H", "L", "V"), size = 50, replace=T)
salary = exp(rnorm(n=50, mean=8.3, sd=0.2))
salary = rlnorm(n=50, meanlog = 8.2, sdlog = 0.2)
start_date = sample(x = 2000:2015, size = 50, replace=T)

sample(x=c(1:5), size=5, replace=F)

emp.data <- data.frame(id=emp_id, name = emp_name, salary, start_date, stringsAsFactors = F)


ID <- rep(1:60, each=3)
Subject



library(dplyr)
install.packages('PogromcyDanych')
library(PogromcyDanych)

# ZADANIE
# w Zb 'imiona_warszawa' podmień -plec 'M' na mężczyzna i 'K' na kobieta
# liczb miesięcy na nazw miesięcu

# Utwórz zmienną 'Grupa' w zb 'auta2012', która przyjmuje etykiety:
# 'stare i tanie' gdy przebieg przekracza 50000 a cena <= 20000
# 'stare i drogie' gdy przebieg przekracza 50000 a cena > 20000
# 'nowe i tanie' gdy przebieg nie przekracza 50000 a cena < 20000
# 'nowe i drogie' gdy przebieg nie przekracza 500000 a cena >=20000

recode(imiona_warszawa$plec, 'M'='Mężczyzna', 'K'='Kobieta')
case_when(
  imiona_warszawa$miesiac == 1 ~ 'Styczeń',
  imiona_warszawa$miesiac == 2 ~ 'Luty',
  imiona_warszawa$miesiac == 3 ~ 'Marzec',
  imiona_warszawa$miesiac == 4 ~ 'Kwiecień',
  imiona_warszawa$miesiac == 5 ~ 'Maj',
  imiona_warszawa$miesiac == 6 ~ 'Czerwiec',
  imiona_warszawa$miesiac == 7 ~ 'Lipiec',
  imiona_warszawa$miesiac == 8 ~ 'Sierpień',
  imiona_warszawa$miesiac == 9 ~ 'Wrzesień',
  imiona_warszawa$miesiac == 10 ~ 'Październik',
  imiona_warszawa$miesiac == 11 ~ 'Listopad',
  imiona_warszawa$miesiac == 12 ~ 'Grudzień',
)

data("auta2012")
auta2012

auta2012$Grupa = case_when(
  auta2012$Przebieg.w.km > 50000 & auta2012$Cena.w.PLN <= 20000 ~ 'stare i tanie', 
  auta2012$Przebieg.w.km > 50000 & auta2012$Cena.w.PLN > 20000 ~ 'stare i drogie',
  auta2012$Przebieg.w.km < 50000 & auta2012$Cena.w.PLN < 20000 ~ 'nowe i tanie',
  auta2012$Przebieg.w.km < 50000 & auta2012$Cena.w.PLN >= 20000 ~ 'nowe i drogie'
)






























































