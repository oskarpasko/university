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