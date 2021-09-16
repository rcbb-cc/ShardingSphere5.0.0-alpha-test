create table t_order0
(
    order_id    bigint comment '订单流水ID',
    user_id     bigint comment '用户ID',
    order_no    varchar(100) comment '订单编号',
    create_time date comment '创建时间',
    primary key (order_id)
);

alter table t_order0
    comment '订单表';