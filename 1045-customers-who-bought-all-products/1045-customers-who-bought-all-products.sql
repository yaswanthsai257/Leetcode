# Write your MySQL query statement below
select customer_id from Customer
group by customer_id
Having Count(distinct(product_key))=(
    select Count(product_key) from
    Product
)