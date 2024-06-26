package br.com.fiap.techfood.app.adapter.output.persistence.entity

import jakarta.persistence.Embeddable
import jakarta.persistence.ForeignKey
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Embeddable
data class OrderItemPk(
    @ManyToOne
    @JoinColumn(name = "order_id",  foreignKey = ForeignKey(name = "fk_order_item_order"))
    var order: OrderEntity? = null,

    @ManyToOne
    @JoinColumn(name = "product_id",  foreignKey = ForeignKey(name = "fk_order_item_product"))
    var product: ProductEntity? = null
)
