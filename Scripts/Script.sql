-- 우편번호
DROP TABLE IF EXISTS `postcode`.`post` RESTRICT;

-- 우편번호검색
DROP SCHEMA IF EXISTS `postcode`;

-- 우편번호검색
CREATE SCHEMA `postcode`;

-- 데이터베이스 사용
use postcode;

-- 우편번호
CREATE TABLE `postcode`.`post` (
	`zipcode`   CHAR(5)     NULL COMMENT '새우편번호', -- 새우편번호
	`sido`      VARCHAR(20) NULL COMMENT '시도', -- 시도
	`sigungu`   VARCHAR(20) NULL COMMENT '시군구', -- 시군구
	`doro`      VARCHAR(80) NULL COMMENT '도로명', -- 도로명
	`building1` INTEGER(5)  NULL COMMENT '건물번호본번', -- 건물번호본번
	`building2` INTEGER(5)  NULL COMMENT '건물번호부번' -- 건물번호부번
)
COMMENT '우편번호';


LOAD data LOCAL INFILE 'E:/post_search/DataFiles/강원도.txt' INTO table post
character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d)
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'E:/post_search/DataFiles/경기도.txt' INTO table post
character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d)
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'E:/post_search/DataFiles/경상남도.txt' INTO table post
character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d)
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'E:/post_search/DataFiles/경상북도.txt' INTO table post
character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d)
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'E:/post_search/DataFiles/광주광역시.txt' INTO table post
character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d)
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;



LOAD data LOCAL INFILE 'E:/post_search/DataFiles/대구광역시.txt' INTO table post
character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d)
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;


LOAD data LOCAL INFILE 'E:/post_search/DataFiles/대전광역시.txt' INTO table post
character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d)
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'E:/post_search/DataFiles/부산광역시.txt' INTO table post
character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d)
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'E:/post_search/DataFiles/서울특별시.txt' INTO table post
character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d)
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'E:/post_search/DataFiles/세종특별자치시.txt' INTO table post
character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d)
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'E:/post_search/DataFiles/울산광역시.txt' INTO table post
character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d)
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'E:/post_search/DataFiles/인천광역시.txt' INTO table post
character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d)
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'E:/post_search/DataFiles/전라남도.txt' INTO table post
character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d)
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'E:/post_search/DataFiles/전라북도.txt' INTO table post
character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d)
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'E:/post_search/DataFiles/제주특별자치도.txt' INTO table post
character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d)
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'E:/post_search/DataFiles/충청남도.txt' INTO table post
character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d)
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'E:/post_search/DataFiles/충청북도.txt' INTO table post
character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d)
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;



CREATE INDEX idx_post_sido On post(sido);
CREATE INDEX idx_post_doro ON post(doro);

select * from post;
select distinct sido from post; 
delete from post where sido='세종특별자치시';
delete from post where sido='전라북도';

SELECT zipcode,sido,sigungu,doro,building1,building2 FROM post where sido='세종특별자치시' and doro='라온로';