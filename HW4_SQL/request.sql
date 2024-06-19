/* візити які існують в базі та які відбулися виключно після 1 Березня 2024 року, 
у видачі для кожного візиту має повернутися його дата, 
причина візиту, виставлений діагноз, 
призначене лікування, ім*я та порода котика, 
а також ім*я та телефонний номер хазяїна котика (все саме в такому порядку) */


SELECT VisitDate, Reason, Diagnosis, Treatment, Cats.Name, Breed FROM Cats
JOIN Visits
ON Cats.CatID = Visits.CatID
JOIN MedicalRecords
ON Visits.VisitID = MedicalRecords.VisitID
WHERE visitDate > 2024-03-01;