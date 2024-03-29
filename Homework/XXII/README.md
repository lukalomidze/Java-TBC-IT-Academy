## დავალება 20.07.2022

შექმენით კლასი ObjectToCustomStringConverter, რომელიც ობიექტს გადაიყვანს სპეციალურ სტრიქონში შემდეგი ფორმატით: [field1=value1;field2=value და ა.შ.] ამ ყველაფერს კი მოახდენს ჩვენ მიერ შექმნილი ანოტაციებით:

1. შექმენით ანოტაცია @CustomStringSerializable რომელიც ეწერება მხოლოდ კლასზე და აღნიშნავს, რომ კლასის გადაყვანა შესაძლებელია სპეციალური ფორმატის სტრიქონში. ეს ანოტაცია უნდა მოხდეს შესაბამისი კლასის javadoc-ში, უნდა დაეწეროს მხოლოდ Figure კლასზე, მაგრამ ანალოგიური წარმატებით იმუშაოს Triangle, Circle, Rectangle და ა.შ. კლასებზე.

2. შექმენით ანოტაცია @Validator, რომელიც შეიძლება დაეწეროს კლასის ველებზეც და მეთოდებზეც. ანოტაციას უნდა ჰქონდეს double min და double max ატრიბუტები და თუ აწერია კლასის ველზე, ნიშნავს რომ ამ ველის მნიშვნელობა უნდა იყოს მეტია ან ტოლი min-ზე და ნაკლები ან ტოლი max-ზე. შესაძლებელი უნდა იყოს min და max ატრიბუტების გამოტოვება და ამ შემთხვევაში, შესაბამისი გამოტოვებული ატრიბუტით არ უნდა მოხდეს ვალიდაცია.

3. თუ მეთოდს აწერია @Validator ანოტაცია, მაშინ ეს მეთოდი უნდა იყოს უპარამეტრო, აბრუნებდეს boolean და ხდებოდეს მისი გამოძახებით კლასის ობიექტის ვალიდურობის დადგენა. მაგალითად, სამკუთხედის შემთხვევაში რომ ორი გვერდის ჯამი მეტი იყოს მესამეზე, შესაბამისი ვალიდაციის მეთოდი, რომ მოინიშნოს @Validator ანოტაციით.

4. შექმენით ანოტაცია @SkipSerialization, რომელიც თუ დაეწერება ველს, მაშინ ეს ველი არ მოხვდება სპეციალურ სტრიქონში, ხოლო თუ ველს ეს ანოტაცია არ აწერია, მაშინ მოხვდება სპეციალურ სტრიქონში ველის სახელით, რაც ჰქვია.

5. ამ ანოტაციებით გააფორმეთ ფიგურების შესაბამისი კლასები.

6. ObjectToCustomStringConverter კლასში დაწერეთ convert მეთოდი, რომელსაც Object ტიპის არგუმენტი გადაეცემა და გადაჰყავს იგი ამოცანის პირობაში მოცემული ფორმატის სტრიქონში. თუ კლასის გადაყავანა შეუძლებელია სპეციალურ სტრიქონში, მაშინ convert მეთოდმა დაარტყას CustomStringSerializationException შესაბამისი მესიჯით. თუ კლასის რომელიმე ველს აქვს არავალიდური მნიშვნელობა (@Validator ანოტაციით განსაზღვრული) ან უწერია @SkipSerialization, მოხდეს მისი გამოტოვება სპეციალურ სტრიქონში. შემდეგ მოხდეს კლასის @Validator ანოტაციით მეთოდების გამოძახება და თუ რომელიმემ დააბრუნა false, მაშინ აღიძრას CustomStringSerializationException შესაბამისი ტექსტით რომ კლასის ობიექტი არაა ვალიდური და შეუძლებელია მისი სპეციალურ სტრიქონში გადაყვანა.

7. დროის დარჩენის შემთხვევაში, უბრალოდ გადაათვალიერეთ შემდეგი ბმული, თუ როგორ ხდება SOURCE ტიპის ანოტაციების შექმნა - https://www.baeldung.com/java-annotation-processing-builder
