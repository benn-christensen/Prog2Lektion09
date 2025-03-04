# Opgaver lektion 9

[https://github.com/benn-christensen/Prog2Lektion09](https://github.com/benn-christensen/Prog2Lektion09)

## Opgave 1

Denne opgave har jeg lånt fra Day 4 - [Advent of Code 2024](https://adventofcode.com/2024/day/4).

I denne opgave skal I finde ud af hvor mange gange ordet XMAS optræder i et todimensionelt
array. 

I den udleverede kode er der givet et todimensionelt array hvor ordet XMAS optræder
18 gange, kan I komme frem til det samme antal?
Op, ned, frem, tilbage, kryds og tværs, alle retninger er gyldige.

## Opgave 2

Opgave 8.2 fra Introduktion to Java Programming and Data Structures.

Find gennemsnittet af tallene i stordiagonalen af en N x N matrice.

## Opgave 3

Opgave 8.13 fra Introduktion to Java Programming and Data Structures.

Find ud af hvor det mindste til i en todimensionel matrice er.

## Opgave 4

Denne opgave omhandler array i 2 dimensioner.

Klassen Absence har en attribut absenceSchema hvor hver række repræsenterer en elev
og hver kolonne repræsenterer en måned.

I klassen Absence skal du programmere metoderne:
1. public void print()
   der udskriver fraværstallene på skærmen. Elevnummer og måned skal fremgå af
   udskriften.

2. public int totalAbsence(int studentNumber)
   der returnerer det samlede antal fraværsdage over de 12 måneder for elev med
   studentNumber

3. public double average(int studentNumber)
   der returnerer gennemsnittet af fraværsdage pr måned for elev med
   studentNumber

4. public int StudentsWithoutAbsence()
   der returnerer hvor mange elever der slet intet fravær har haft i de 12 måneder.

5. public int mostAbsence()
   der returnerer elevnummer for den elev der har haft det højeste antal fraværsdage over
   de 12 måneder.
6. public void reset(int studentNumber)
   der laver en opdatering af tabellen så eleven med studentNumber, ingen fravær har i
   alle 12 måneder.
7. Udvid main metoden i klassen Opgave04, så alle de ovenstående metoder prøves af.
   
## Opgave 5

   I denne opgave skal I implementere Minesweeper spillet.
   Jeg har forsøgt at lave brugergrænsefladen, på en måde således at I ikke behøver at ændre i
   denne del.
1. I klassen Controller har jeg lavet en metode handle der bliver kaldt, når man trykker
   på et felt. Lige nu bliver der sat et flag (et F) hvis man trykker på venstre museknap.
   Men antallet af Miner man skal finde, bliver ikke talt ned, I Board klassen er der en
   remainingMines attribut, sørg for at denne bliver talt ned når man sætter et flag.
2. Man kan jo fortryde at man har sat et flag, så implementer at hvis man trykker med
   venstre museknap på et felt, hvor der allerede er et flag, så skal dette flag fjernes.
3. Hvis man trykker på et felt der ikke er afsløret eller sat et flag på, skal dette felt vises.
   Hvis man trykker på et felt hvor der er en mine, skal dette vises (et M) og man har
   tabt.
4. Hvis der ikke er en mine, skal der vises hvor mange af de 8 nabofelterne der
   indeholder en mine, så et tal mellem 1 – 8.
5. Hvis der ikke er nogle af nabofelterne der indeholder en mine efterlades feltet tomt og
   der afsløres hvor mange af nabofelternes nabofelter der indeholder en mine (rekursivt)
6. Hvis man har sat 10 flag skal det afsløres om man har ramt rigtigt og sat flagene de
   rigtige steder altså der hvor der er miner.