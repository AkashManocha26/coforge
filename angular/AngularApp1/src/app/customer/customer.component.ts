import { Component, Input } from '@angular/core';

import { customer } from './customer';

import { CommonModule } from '@angular/common';

import { FormsModule } from '@angular/forms';

@Component({

 selector: 'app-customer',

 standalone: true,

 imports: [CommonModule,FormsModule],

 templateUrl: './customer.component.html',

 styleUrl: './customer.component.css'

})

export class CustomerComponent {

 @Input() name:String='Bhavya Sharma';

 customer:customer=new customer();

 customer1:customer[];

 img_src:String;

 img_width:number;

 img_height:number;

 constructor(){

  this.img_height=150;

  this.img_width=200;

  this.img_src="img1.avif"

  this.customer1=[

   {"customerId":1001,"customerName":"Bhavya Sharma","customerSalary":75000},

   {"customerId":1002,"customerName":"Tushar Sharma","customerSalary":45000},

   {"customerId":1003,"customerName":"Kunal Sharma","customerSalary":65000},

   {"customerId":1004,"customerName":"Deep Sharma","customerSalary":96000},

   {"customerId":1005,"customerName":"Aditya Sharma","customerSalary":75000},

   {"customerId":1006,"customerName":"Nitin Sharma","customerSalary":62000},

  ]

 }

 customerClick(){

  alert("customer clicked")

 }

}