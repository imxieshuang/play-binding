package com.simon.playbinding

import com.thoughtworks.binding.{Binding, dom}
import org.scalajs.dom.html.Button
import org.scalajs.dom.{Event, document}

object ScalaJSExample {

  def main(args: Array[String]): Unit = {
    dom.render(document.body, bindingButton)
  }

  @dom
  def bindingButton(): Binding[Button] = {
    <button class="btn btn-danger"
            onclick={event: Event =>
              org.scalajs.dom.window.alert("hello world!")}>
      Modify the name
    </button>
  }
}
