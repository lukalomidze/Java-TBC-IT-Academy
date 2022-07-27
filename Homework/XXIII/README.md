## დავალება 23.07.2022

წინა დაველებების მიხედვით დაწერეთ ფიგურების ფაილიდან წაკითხვის პროგრამა.  circles_in.dat, triangles_in.dat და rectangles_in.dat ფაილებიდან  პროგრამა უნდა წაიკითხოს შესაბამისი ფიგურები. ფაილებში სამკუთხედის და  მართკუთხედის გვერდები ჩაწერილია - (ტირე) დელიმიტირით, თითო ფიგურა თითო  ხაზზე. circles_in.dat ფაილი შეიცავს მხოლოდ 1 ხაზს, სადაც წრეწირების  რადიუსები გამოყოფილია ასევე - (ტირე) დელიმიტერით.
პროგრამა უნდა  წაიკითხოს ფიგურები, შეინახოს შესაბამის ობიექტებში და მუშაობის შედეგად  უნდა შექმნას circles_out.dat, triangles_out.dat და rectangles_out.dat  ფაილები, სადაც მონაცემები შეინახება in ფაილების ანალოგიური ფორმატით -  ტირე დელიმიტერის ნაცვლად # დელიმიტერით.

1. in ფაილები შევსება  გააკეთეთ ასევე ჯავა პროგრამიდან შემდეგნაირად: ფიგურების გვერდები  დააგენერირეთ Random-ით და თითო ფაილში ჩაწერეთ 70 000 ფიგურა ამოცანის  პირობაში მოცემული in ფაილის ფორმატით. სამივე ფაილის შევსების პროცესი  უნდა იყოს პარალელური.

2. მთავარი ნაკადი უნდა დალოდოს პირველ პუქნტში  აღწერილი სამივე ფიგურის in ფაილების შევსებას და როდესაც თითოეული  დასრულდება, შემდეგ დაიწყოს წაკითხვის პროცესი.

3. წაკითხვის პროცესმა  უნდა ჩაწეროს ფიგურები out ფაილებში ასევე ზემოთ აღწერილ ფორმატში. სამივე  ფიგურის ჩაწერის პროცესიც უნდა იყოს პარალელური.

4. პროგრამას ასევე  უნდა ჰქონდეს 1 ფონური დემონ-ნაკადი, რომელიც პროგრამის მუშაობის პარალელურად კონსოლზე ბეჭდავს ინფორმაციას: მიმდინარე დროს (საათი, წუთი, წამი) და რომელიც ეტაპზეა პროგრამა, generating in files ან generating out  files. ეს ტექსტები უნდა იბეჭდებოდეს 2 წამიანი ინტერვალებით