# Conflict Шийдвэрлэлт

## Conflict-ийн Дэлгэрэнгүй

`conflict_branch`-ийг `develop` руу нэгтгэхэд `src/main/java/labxx/sict/must/edu/mn/Multiplication.java` дээр merge conflict гарсан. Conflict нь `testMultiplyPositive` функцын `test conflict` ба `test conflict 2` коммент дээр байсан.

## Шийдвэрлэлтийн Алхмууд

1. Онцлогын салбарт `git merge develop` ажиллуулсан.
2. `Multiplication.java` дээрх conflict-ийг тодорхойлсон.
3. `Accept current` дарж хоёр салбарын `test conflict` комментийг нэгтгэсэн.
4. `git add src/main/java/labxx/sict/must/edu/mn/Multiplication.java` ажиллуулсан.
5. `git commit` ажиллуулж merge-ийг дуусгасан.
6. Салбарыг push хийж, PR үүсгэсэн.
