library(readxl)
library(forecast)
library(tseries)
library(fBasics)
library(TTR)
library(timeSeries)
library(lmtest)

dane <- read_excel("Dane.xlsx")

print(n=50, dane)