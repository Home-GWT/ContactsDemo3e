* `GWT Contacts Demo with MVP`: [GWT Contacts Demo with MVP and Testing](http://toedter.com/2012/01/16/gwt-contacts-demo-with-mvp-and-testing/) | [github.com/toedter/gwt-mvp-contacts](https://github.com/toedter/gwt-mvp-contacts)
![gwt-contacts](http://www.toedter.com/wp-content/uploads/2012/01/gwt-contacts.png)

* [martinfowler.com/eaaDev/SupervisingPresenter](http://www.martinfowler.com/eaaDev/SupervisingPresenter.html)
* [martinfowler.com/eaaDev/PassiveScreen](http://www.martinfowler.com/eaaDev/PassiveScreen.html)
* [developers.google.com/web-toolkit/tools/download-gwtdesigner](https://developers.google.com/web-toolkit/tools/download-gwtdesigner?csw=1)
* [gwtproject.org/doc/latest/DevGuideMvpActivitiesAndPlaces](http://www.gwtproject.org/doc/latest/DevGuideMvpActivitiesAndPlaces.html)


* `Платформа Google App Engine для Java-приложений : Часть 1. Знакомство`: [j-gaej1](http://www.ibm.com/developerworks/ru/library/j-gaej1/)
* `Платформа Google App Engine для Java-приложений: Часть 2. Создание шедевра`: [j-gaej2](http://www.ibm.com/developerworks/ru/library/j-gaej2/)
* `Google Web Toolkit - Showcase of Features`: [CwCellBrowser](http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellBrowser)
* `GWT+EXTJS подключаем MySQL`: [mabp.kiev.ua/2009/04/12/gwt-extjs-connecting-to-mysql](http://mabp.kiev.ua/2009/04/12/gwt-extjs-connecting-to-mysql/)
![gwt_extjs_mysql](http://mabp.kiev.ua/content/img/illustrations/gwt_extjs_mysql/result.jpg)


* `com.contactsdemo.server.VCardContactsRepository` **Для Windows-системы:** [String path = getClass().getResource("").getPath();](#) | **Для Linux-системы:** [String path = "/"+getClass().getResource("").getPath();](#)


##[ Google App Engine Java и Google Web Toolkit.pdf ]...........[ ГЛАВА 19 ]...........[ страница #321 ]
##Поддержка истории Web-браузера
> Для Ajax-приложений с **одной HTML-страницей**, содержимое которой изменяется есть проблема с использованием кнопок Web-браузера **Назад** и **Вперед**.
>
> Фреймворк в GWT предлагает решение этой проблемы с помощью класса **com.google.gwt.user.client.History**.

##[ Google App Engine Java и Google Web Toolkit.pdf ]...........[ ГЛАВА 20 ]...........[ страница #324 ]...........[`создан на основе механизма History-фреймворка - он оперирует объектами Place и Activity`]
## Фреймворк *Activities* and *Places* (`обеспечивает добавление URL-фрагментов к адресной строке для веб-страниц GWT-приложения; связывая их с историей Web-браузера`)
> Объект **Place** представляет состояние веб-страницу(ы) для GWT-приложения **(** *и может быть конвертирован в URL-фрагмент адреса GWT-приложения* **)**.
>
> Веб-страницы GWT-приложения связываются между собой URL-фрагментами с помощью **Tokenizer** **(** *com.google.gwt.place.shared.PlaceTokenizer* **)**.
>
> Синхронизируется URL-фрагмент с веб-страницей с помощью **com.google.gwt.place.shared.PlaceHistoryMapper** **(** *маркируется аннотацией @WithTokenizers - для авто-реализации при вызове GWT.create(Class)* **)**.
>
> Представление GUI-интерфейса для веб-страницы GWT-приложения создается с помощью составного компонента **Widget**.
>
> **Activity** **(** *com.google.gwt.activity.shared.AbstractActivity* **)** отвечает за **:** *Загрузку GUI-интерфейса веб-страницы GWT-приложения* **;** *Отображение сообщений пользователю при переходе на другую веб-страницу* **;** *При закрытии окна Web-браузера* **;**
>
> Связать веб-страницы GWT-приложения с **Activity** можно с помощью **com.google.gwt.activity.shared.ActivityMapper** **(** *с определением его метода Activity getActivity(place)* **)**

##gwt-tutorial-ru.pdf ...... Асинхронный вызовы ...... Создайте прокси сервисного класса ...... Создайте callback ...... страница #29-30
* `gwt-tutorial-ru.pdf`: [drive.google.com/file/d/0B418nT5Bo9w_engtSTdpVDllY2s](https://drive.google.com/file/d/0B418nT5Bo9w_engtSTdpVDllY2s/view) **(** *[github.com/Home-GWT/docs/blob/master/gwt-tutorial-ru.pdf](https://github.com/Home-GWT/docs/blob/master/gwt-tutorial-ru.pdf)* **)**
