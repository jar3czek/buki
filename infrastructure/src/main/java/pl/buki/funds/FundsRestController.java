package pl.buki.funds;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
class FundsRestController {

  private final FundsService fundsService;

  @PostMapping("players/{id}/funds")
  void addFunds(@PathVariable String id, @RequestBody AddFundsRequest addFundsRequest) {
    fundsService.addFunds(id, addFundsRequest.getEuroGoals());
  }


}
