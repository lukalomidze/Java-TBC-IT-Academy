## დავალება 27.06.2022

1. წინა დავალებაში (24.06.2022) მოცემულ მე-2 პუნქტში (username და  პაროლების ფაილიდან წაკითხვა) ფაილის ფორმატი გადააკეთეთ ასე და აამუშავეთ  პროგრამა.
user1.username=username_1
user1.password=password_1
user2.username=username_2
user2.password=password_2
user3.username=username_3
user3.password=password_3

2.  პირველ პუნქტში კონფიგურაციის ფაილს გაუკეთეთ ვალიდაცია და თუ რომელიმე  user-მა ვერ გაიარა ვალიდაცია, პროგრამამ ავარიულად დაასრულოს მუშობა  შესაბამისი ტექსტით. ვალიდაცია მდგომარეობს შემდეგში: username-ში  დასაშვებია a-zA-Z_0-9 მხოლოდ ეს სიმბოლოები და სიგრძე უნდა იყოს მინიმუმ 5  და მაქსიმუმ 20. პაროლში აუცილებლად უნდა ერიოს მინიმუმ ერთი დაბალი  რეგისტრის a-z ასო, მინიმუმ ერთი მაღალი რეგისტრის ასო A-Z, მინიმუმ 1  სიმბოლოო, რომელიც არ იქნება a-zA-Z_0-9 აქედან არც ერთი, მინიმალური  სიგრძე ჰქონდეს 7 და მაქსიმალური არ იყოს შეზღუდული. მნიშვნელობებს  შეიძლება ბოლოში ჰქონდეთ whitespace-ები და პროგრამამ ისინი უნდა მოაშოროს  სანამ მნიშვნელობად აიღებს და ვალიდაციას გაუკეთებს.

3. მოცემულია  მობილური ნომერი ასეთ ფორმატში: (+995) [599] 12-34-56 გარდაქმენით 9-ნიშნა  ფორმატში. შემდეგ დაწერეთ მეთოდი, რომელიც შეამოწმებს გარდაქმნილი  მნიშვნელობის სისწორეს რეგქსით ვალიდაციით. ანუ რომ უნდა იყოს 9-ნიშნა და  იწყებოდეს 5-ით. ასევე საწყისი ფორმატიდან ამოჭერით ქვეყნის კოდი.

4.  მოცემულია წინანადება, რომელიც მთავრდება წერტილით. მაგალითად, This is a  dog. დაწერეთ პროგრამა, რომელიც ამ წინადადებას დაშლის სიტყვებად და  დააბრუნებს მათ: This, is, a, dog - პირობითად a-იც ითვლებოდეს სიტყვად.  გაითვალისწინეთ, რომ წინადადება შეიძლება შეიცავდეს სხვადასხვა სასვენ  ნიშნებს და ისინი სიტყვების ამოღებისას არ უნდა გაყვეს. მაგალითად: I like  tea, but not - coffee.

5. მოცემულია ტექსტი: ClientName: Mark Twain,  Address: London, Balance: 123.56 - ამოჭერით კლიენტის სახელი, გვარი,  მისამართი და ბალანსი.

6. ერთ-ერთი პუნქტი შეასრულეთ ისე, რომ ჯავას  კოდიდან regex გაიტანოთ .properties კონფიგურაციულ ფაილში და იქიდან  ამოიკითხოთ. ასევე გაუკეთეთ Exception Handling და Exception-ის  შემთხვევაში კონსოლზე წითლად დააბეჭდინეთ მესიჯი. თუ მესიჯის სიგრძე მეტია  100-ზე, დაიბეჭდოს პირველი 100 სიმბოლო, ხოლო თუ ნაკლებია ან ტოლია, მაშინ  სრულად მესიჯი