SELECT @@VERSION;

--1

select * from HumanResources.Employee order by JobTitle

--2

select * from Person.Person as P order by LastName


--3 
select firstname , lastname , businessentityid as Employee_id from Person.person order by  lastname

--4 

select productid , productnumber , name as prodcuname from Production.Product  where productline = 'T' and SellStartDate is not null order by name               

--5

select	salesorderid , customerid , orderdate , subtotal  , (taxamt /subtotal) * 100 as tax_percent
from  sales.salesorderheader order by subtotal desc

--6

select DISTINCT jobtitle from HumanResources.Employee

--7
SELECT customerid, sum(freight) as total_freight
FROM sales.salesorderheader
group by customerid
order by customerid

--8

select customerid , salespersonid , avg(subtotal) as avg_subtotal , sum(subtotal) as sum_subtotal
from sales.salesorderheader 
group by CustomerID , SalesPersonID
order by CustomerID desc

--9
select productid , sum(quantity) as total_quantity
from production.productinventory
where shelf in ('A' , 'C' ,  'H')
group by ProductID
having sum(quantity) > 500

--10
select sum(quantity) as total_quantity
from production.productinventory
group by (LocationID * 10)

--11 
select ph.BusinessEntityID , firstname , lastname , phonenumber as person_phone 
from Person.PersonPhone as ph join Person.Person as p
on ph.BusinessEntityID = p.BusinessEntityID
where lastname like 'L%'
order by lastname , firstname 

--12
select salespersonid , customerid , sum(subtotal) as sum_subtotal
from sales.salesorderheader
group by ROLLUP(SalesPersonID ,  CustomerID)

--13
select locationid , shelf , SUM(quantity) as totalquantity
from production.productinventory
group  by CUBE(locationid , shelf)

--17
select YEAR(OrderDate) as Year , sum(totaldue) from Sales.SalesOrderHeader
group by YEAR(OrderDate)
order by YEAR(OrderDate)

--18
select YEAR(OrderDate) as Year , sum(totaldue) from Sales.SalesOrderHeader
group by YEAR(OrderDate)
having YEAR(OrderDate) <= '2016'
order by YEAR(OrderDate)


--19
	select contacttypeid , name 
	from Person.ContactType
	where name like '%manager%'
	order by name desc

--20 

	SELECT pp.BusinessEntityID, LastName, FirstName
    FROM Person.BusinessEntityContact AS pb 
 
        INNER JOIN Person.ContactType AS pc
            ON pc.ContactTypeID = pb.ContactTypeID
        
        INNER JOIN Person.Person AS pp
            ON pp.BusinessEntityID = pb.PersonID
    WHERE pc.Name = 'Purchasing Manager'
    ORDER BY LastName, FirstName;
	


--22
select pc.ContactTypeid , Name , Count(*) as NoContacts
FROM Person.BusinessEntityContact AS pbe
join Person.ContactType As pc
ON pc.ContactTypeID = pbe.ContactTypeID
GROUP BY pc.ContactTypeID, pc.Name
having count(*) > 100

--23
select CAST(ep.RateChangeDate as VARCHAR(10))as fromdate , CONCAT(LastName, ', ', FirstName, ' ', MiddleName) AS NameInFull,
(40 * ep.Rate) as salaryinweek
from Person.person as p
join HumanResources.EmployeePayHistory as ep on ep.BusinessEntityID = p.BusinessEntityID
order by NameInfull

--25
--select  , productid , orderqty , SUM(orderqty) as total quantity , AVG(orderqty) as Avg quantity , COUNT(orderqty) as No of orders ,MIN(OrderQty) AS "Min Quantity" ,MAX(OrderQty) AS "Max Quantity",
select SalesOrderID , ProductID , OrderQty , sum(orderqty) over(partition by SalesOrderID) as "total qty"
, avg(orderqty) over(partition by SalesOrderID) as "avg quantity" ,
count(orderqty) over(partition by SalesOrderID) as "no of orders" ,
min(orderqty) over(partition by SalesOrderID)  as "Mon quantity" , 
max(OrderQty) over(partition by SalesOrderID) as "Max quantity"
From Sales.SalesOrderDetail
where SalesOrderID in (43659 , 43664)


--26

select salesorderid as ordernumber,
productid,
orderqty as quantity,
sum(orderqty) over(partition by SalesOrderID order by productid) as total,
avg(orderqty) over(partition by SalesOrderID  order by productid) as average,
count(orderqty) over(partition by SalesOrderID  order by productid) as count
From Sales.SalesOrderDetail
where SalesOrderID in (43659 , 43664) and cast(ProductID as varchar) LIKE '71%'

--27
select salesorderid,
SUM(orderqty * unitprice) as orderidcost
from Sales.SalesOrderDetail
group by salesorderid 
having SUM(orderqty * unitprice) > 100000
order by salesorderid

--28
select productid , name
from Production.Product
where name like 'Lock Washer%'
order by productid

--29
select productid ,  name , color 
from Production.Product
order by ListPrice


--30
select businessentityid , jobtitle , hiredate
from HumanResources.Employee
order by YEAR(hiredate) 

--31
select lastname , firstname 
from Person.Person
where lastname like 'R%'
order by firstname , lastname desc

--32
SELECT BusinessEntityID, SalariedFlag   
FROM HumanResources.Employee  
ORDER BY CASE SalariedFlag WHEN 'true' THEN BusinessEntityID END DESC  
,CASE WHEN SalariedFlag ='false' THEN BusinessEntityID END;

--33
select businessentityid , lastname , TerritoryName ,CountryRegionName 
from Sales.vSalesPerson
where TerritoryName is not null
ORDER BY CASE CountryRegionName WHEN 'United States' THEN TerritoryName  
ELSE CountryRegionName END

--34
