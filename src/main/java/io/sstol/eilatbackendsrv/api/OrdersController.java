package io.sstol.eilatbackendsrv.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sergey Stol
 * 2022-04-15
 */
@RestController
@RequestMapping("/v1" + "/orders")
@RequiredArgsConstructor
public class OrdersController {

    @GetMapping("/greetings")
    @ResponseStatus(HttpStatus.OK)
    public String getOrderById() {
        System.out.println("Hello world!");
        return "Hello world!";
    }

//    // GET /v1/orders/:id
//    @GetMapping(value = "/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public SpringDataJaxb.OrderDto getOrderById(@PathVariable long id) {
//        return service.getOrder(id);
//    }

    // GET /v1/orders
//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public List<OrderDto> getOrders() {
//        return service.getOrders();
//    }
//
//    // POST /v1/orders
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public String addOrder(@RequestBody OrderDto orderDto) {
//        return service.addOrder(orderDto);
//    }
//
//    // PUT /v1/orders
//    @PutMapping
//    @ResponseStatus(HttpStatus.ACCEPTED)
//    public void updateOrder(OrderDto orderDto) {
//        service.updateOrder(orderDto);
//    }
//
//    // DELETE /v1/orders/:id
//    @DeleteMapping(value = "/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteOrder(@PathVariable long id) {
//        service.deleteOrder(id);
//    }
}