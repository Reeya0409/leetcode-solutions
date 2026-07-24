Select s.user_id , Round(ifnull(avg(case when c.action= 'confirmed' then 1 else 0 end),0),2) 
as confirmation_rate from Signups s Left Join Confirmations c on s.user_id= c.user_id group by s.user_id;