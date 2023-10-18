library(readxl)
library(forecast)
library(tseries)
library(fBasics)
library(timeSeries)
library(lmtest)
library(TTR)

raw_data <-read_excel("dane.xlsx")
head(raw_data)

# modele nieliniowe
# modelowanie
