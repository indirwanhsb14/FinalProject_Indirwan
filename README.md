# FinalProject_Indirwan
Aplikasi Pemesanan Bus

## Informasi 
Indirwan Ihsan Hasibuan <br>
Kode peserta : `JVSB001ONL005` <br>
Github : `https://github.com/indirwanhsb14/FinalProject_Indirwan` <br>


<br>


## Api endpoint

1. agency-controller
2. auth-controller
3. bus-controller
4. user-controller ` = Pendaftaran User Baru`
5. reservation-controller ` = Untuk pemesanan tiket`
6. stop-controller
7. ticket-controller
8. trip-controller
9. trip-schedule-controller


<br>


## Generate schema database (HIBERNATE) 
1. untuk pembuatan schema pertama kali, set `spring.jpa.hibernate.ddl-auto=update`
2. setelah selesai, ubah `spring.jpa.hibernate.ddl-auto=validate`, untuk melakukan validasi spring JPA dengan database schema


<br>


## Dependencies
> java 8, spring JPA, spring Security, spring Web, spring Devtools, PostgreSQL, Swagger, Flyway, Lombok, JWT


<br>


## Format input API endpoint

1.  POST `/api/v1/user/signup` <br>
   `email : indirwan.hasibuan@gmail.com` <br>
   `firstName : Indirwan` <br>
   `lastName : Hasibuan` <br>
   `mobileNumber : 087865447890` <br>
   `password : admin123` <br>
   `role : [ROLE_ADMIN]` <br>
   `username : indirwan` <br><br>
   note : <br>
   role hanya ada 2 `ROLE_USER / ROLE_ADMIN` jika ingin mengakses ke semua endpoint pakai `ROLE_ADMIN` pastikan `huruf kapital semua` <br>
   username untuk login/autentikasi <br><br>
   
2.  POST `/api/auth` untuk autentikasi user/login <br>
   `username : indirwan` username untuk login/autentikasi <br>
   `password : admin123` <br><br>
    
3.  POST `/api/v1/ticket` <br>
   `journeyDate : 22/10/2022` wajib pakai slash <br>
   `tripScheduleId : Id TripSchedule` ID trip schedule <br><br>
    Input tidak valid jika TripSchedule tidak mempunyai Tanggal keberangkatan yang sama dengan `journeyDate` <br><br>

4.  POST `/api/v1/agency/` <br>
   `code : MDN` code agency <br>
   `details : Medan` detail code agency <br>
   `name : Reza` nama agency <br><br>

5.  POST `/api/v1/bus/` <br>
   `agencyID : 1` ID agency utk add bus<br>
   `capacity : 50` kapasitas bus <br>
   `code : BDL01` code bus <br>
   `make : 50` <br><br>
   
6.  POST `/api/v1/stop` <br>
   `code : 1-8` code stop <br>
   `detail : Sukabumi` detail penjelasan stop <br>
   `id : 5` id stop <br>
   `name : Sukarame 1-2` Nama Pemberentian bus  <br><br>
   
7.  POST `/api/v1/trip` <br>
   `agencyId : 1` Id agency <br>
   `busId : 1` Id bus <br>
   `destStopId : 1` Id destStop/pemberhentian <br>
   `fare : 150000` Biaya trip <br>
   `journeyTime : 200` Waktu trip dalam menit <br>
   `sourceStopId : 2` Id sourceStop/pemberangkatan <br><br>

8.  POST `/api/v1/tripschedules` <br>
   `availableSeats : 10` jumlah kursi bus <br>
   `tripDate : 25/12/2022` wajib pakai slash, dan tanggal input harus lebih besar dari hari ini <br>
   `tripDetail : 1` Id trip <br><br>


<br>


